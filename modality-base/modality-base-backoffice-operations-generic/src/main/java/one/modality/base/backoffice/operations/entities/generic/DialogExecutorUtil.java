package one.modality.base.backoffice.operations.entities.generic;

import dev.webfx.platform.async.Future;
import dev.webfx.platform.async.Promise;
import dev.webfx.platform.uischeduler.UiScheduler;
import dev.webfx.stack.ui.controls.alert.AlertUtil;
import dev.webfx.stack.ui.controls.dialog.DialogBuilderUtil;
import dev.webfx.stack.ui.controls.dialog.DialogContent;
import dev.webfx.stack.ui.dialog.DialogCallback;
import dev.webfx.stack.ui.exceptions.UserCancellationException;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.util.function.Supplier;

/**
 * @author Bruno Salmon
 */
public final class DialogExecutorUtil {

    public static Future<Void> executeOnUserConfirmation(String confirmationText, Pane parentContainer, Supplier<Future<?>> executor) {
        Promise<Void> promise = Promise.promise();
        UiScheduler.runInUiThread(() -> {
            DialogContent dialogContent = new DialogContent().setContent(new Text(confirmationText));
            boolean[] executing = { false };
            DialogBuilderUtil.showModalNodeInGoldLayout(dialogContent, parentContainer).addCloseHook(() -> {
                if (!executing[0])
                    promise.fail(new UserCancellationException());
            });
            DialogBuilderUtil.armDialogContentButtons(dialogContent, dialogCallback -> {
                executing[0] = true;
                Button executingButton = dialogContent.getOkButton();
                turnOnButtonWaitMode(executingButton);
                executor.get()
                    .onFailure(cause -> {
                        promise.fail(cause);
                        UiScheduler.runInUiThread(() -> {
                            reportException(dialogCallback, parentContainer, cause); // Actually just print stack trace for now...
                            if (dialogCallback != null) // So we close the window
                                dialogCallback.closeDialog();
                            turnOffButtonWaitMode(executingButton);
                        });
                    })
                    .onSuccess(b -> {
                        promise.complete();
                        UiScheduler.runInUiThread(() -> {
                            if (dialogCallback != null)
                                dialogCallback.closeDialog();
                            turnOffButtonWaitMode(executingButton);
                        });
                    });
            });
        });
        return promise.future();
    }

    private static void reportException(DialogCallback dialogCallback, Pane parentContainer, Throwable cause) {
        if (dialogCallback != null)
            dialogCallback.showException(cause);
        else
            AlertUtil.showExceptionAlert(cause, parentContainer.getScene().getWindow());
    }

    private static void turnOnButtonWaitMode(Button button) {
        ProgressIndicator progressIndicator = new ProgressIndicator();
        progressIndicator.setPrefSize(20, 20); // Note setMaxSize() doesn't work with WebFX but setPrefSize() does
        button.setDisable(true);
        button.setGraphic(progressIndicator);
    }

    private static void turnOffButtonWaitMode(Button button) {
        button.setDisable(false);
        button.setGraphic(null);
    }

}
