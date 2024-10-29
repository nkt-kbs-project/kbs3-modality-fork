package one.modality.base.client.icons;

import dev.webfx.extras.panes.MonoPane;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.shape.SVGPath;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author Bruno Salmon
 */
public final class SvgIcons {

    private static final String TRASH_PATH = "M 6.3952 2.7317 H 9.4429 C 9.4429 2.3177 9.2823 1.9207 8.9965 1.6279 C 8.7107 1.3352 8.3232 1.1707 7.919 1.1707 C 7.5149 1.1707 7.1273 1.3352 6.8416 1.6279 C 6.5558 1.9207 6.3952 2.3177 6.3952 2.7317 Z M 5.2524 2.7317 C 5.2524 2.373 5.3214 2.0178 5.4554 1.6863 C 5.5894 1.3549 5.7858 1.0538 6.0334 0.8001 C 6.2811 0.5464 6.575 0.3452 6.8986 0.2079 C 7.2221 0.0707 7.5689 0 7.919 0 C 8.2692 0 8.616 0.0707 8.9395 0.2079 C 9.263 0.3452 9.5571 0.5464 9.8047 0.8001 C 10.0523 1.0538 10.2487 1.3549 10.3827 1.6863 C 10.5168 2.0178 10.5857 2.373 10.5857 2.7317 H 14.9667 C 15.1182 2.7317 15.2636 2.7934 15.3707 2.9032 C 15.4779 3.0129 15.5381 3.1618 15.5381 3.3171 C 15.5381 3.4723 15.4779 3.6212 15.3707 3.731 C 15.2636 3.8408 15.1182 3.9024 14.9667 3.9024 H 13.961 L 13.0695 13.3549 C 13.0011 14.0792 12.6718 14.7514 12.1459 15.2405 C 11.6198 15.7295 10.9349 16.0003 10.2246 16 H 5.6135 C 4.9033 16.0001 4.2186 15.7292 3.6927 15.2402 C 3.1669 14.7512 2.8377 14.0791 2.7693 13.3549 L 1.8771 3.9024 H 0.8714 C 0.7199 3.9024 0.5745 3.8408 0.4674 3.731 C 0.3602 3.6212 0.3 3.4723 0.3 3.3171 C 0.3 3.1618 0.3602 3.0129 0.4674 2.9032 C 0.5745 2.7934 0.7199 2.7317 0.8714 2.7317 H 5.2524 Z M 6.7762 6.439 C 6.7762 6.2838 6.716 6.1349 6.6088 6.0251 C 6.5017 5.9153 6.3563 5.8537 6.2048 5.8537 C 6.0532 5.8537 5.9079 5.9153 5.8007 6.0251 C 5.6935 6.1349 5.6333 6.2838 5.6333 6.439 V 12.2926 C 5.6333 12.4479 5.6935 12.5968 5.8007 12.7066 C 5.9079 12.8164 6.0532 12.878 6.2048 12.878 C 6.3563 12.878 6.5017 12.8164 6.6088 12.7066 C 6.716 12.5968 6.7762 12.4479 6.7762 12.2926 V 6.439 Z M 9.6333 5.8537 C 9.4818 5.8537 9.3364 5.9153 9.2293 6.0251 C 9.1221 6.1349 9.0619 6.2838 9.0619 6.439 V 12.2926 C 9.0619 12.4479 9.1221 12.5968 9.2293 12.7066 C 9.3364 12.8164 9.4818 12.878 9.6333 12.878 C 9.7849 12.878 9.9302 12.8164 10.0374 12.7066 C 10.1446 12.5968 10.2048 12.4479 10.2048 12.2926 V 6.439 C 10.2048 6.2838 10.1446 6.1349 10.0374 6.0251 C 9.9302 5.9153 9.7849 5.8537 9.6333 5.8537 Z";
    private static final String PLUS_PATH = "M9.8975 18.9698C15.0129 18.9698 19.1597 14.823 19.1597 9.70756C19.1597 4.59216 15.0129 0.445312 9.8975 0.445312C4.7821 0.445312 0.635254 4.59216 0.635254 9.70756C0.635254 14.823 4.7821 18.9698 9.8975 18.9698ZM8.57465 5.29908H11.221V8.3878H14.308V11.0342H11.221V14.1203H8.57465V11.0342H5.48678V8.3878H8.57465V5.29908Z";
    private static final String MINUS_PATH = "M 8.75 17.5 C 6.4294 17.5 4.2038 16.5781 2.5628 14.9372 C 0.9219 13.2962 0 11.0706 0 8.75 C 0 6.4294 0.9219 4.2038 2.5628 2.5628 C 4.2038 0.9219 6.4294 0 8.75 0 C 11.0706 0 13.2962 0.9219 14.9372 2.5628 C 16.5781 4.2038 17.5 6.4294 17.5 8.75 C 17.5 11.0706 16.5781 13.2962 14.9372 14.9372 C 13.2962 16.5781 11.0706 17.5 8.75 17.5 Z M 8.75 15.75 C 10.6065 15.75 12.387 15.0125 13.6998 13.6998 C 15.0125 12.387 15.75 10.6065 15.75 8.75 C 15.75 6.8935 15.0125 5.113 13.6998 3.8003 C 12.387 2.4875 10.6065 1.75 8.75 1.75 C 6.8935 1.75 5.113 2.4875 3.8003 3.8003 C 2.4875 5.113 1.75 6.8935 1.75 8.75 C 1.75 10.6065 2.4875 12.387 3.8003 13.6998 C 5.113 15.0125 6.8935 15.75 8.75 15.75 Z M 13.125 7.875 V 9.625 H 4.375 V 7.875 H 13.125 Z";
    private static final String BACK_ARROW_PATH = "M 0 17.5 C 0 27.1645 7.8354 35 17.5 35 C 27.1645 35 35 27.1645 35 17.5 C 35 7.8354 27.1645 0 17.5 0 C 7.8354 0 0 7.8354 0 17.5 Z M 21.2019 24.9038 L 10.2569 17.5 L 21.2019 11.5265 V 24.9038 Z";
    private static final String TOP_ARROW_PATH = "M14 28C6.25882 28 0 21.7412 0 14C0 6.25882 6.25882 0 14 0C21.7412 0 28 6.25882 28 14C28 21.7412 21.7412 28 14 28ZM14 1.64706C7.16471 1.64706 1.64706 7.16471 1.64706 14C1.64706 20.8353 7.16471 26.3529 14 26.3529C20.8353 26.3529 26.3529 20.8353 26.3529 14C26.3529 7.16471 20.8353 1.64706 14 1.64706Z M20.8352 15.4L14 8.56467L7.16466 15.4L6.01172 14.247L14 6.25879L21.9882 14.247L20.8352 15.4Z M13.1758 7.41162H14.8228L14.8228 21.4116H13.1758L13.1758 7.41162Z";
    private static final String BOTTOM_ARROW_PATH = "M14 28C6.259 28 0 21.741 0 14C0 6.259 6.259 0 14 0C21.741 0 28 6.259 28 14C28 21.741 21.741 28 14 28ZM14 1.647C7.164 1.647 1.647 7.165 1.647 14C1.647 20.835 7.164 26.353 14 26.353C20.835 26.353 26.353 20.835 26.353 14C26.353 7.165 20.835 1.647 14 1.647Z M20.8357 12.271L14.0007 19.106L7.16473 12.271L6.01172 13.424L14.0007 21.412L21.9887 13.424L20.8357 12.271Z M13.1758 20.2588H14.8228V6.25879H13.1758V20.2588Z";
    private static final String PINPOINT_PATH = "M5.5 7.68117C5.87813 7.68117 6.20194 7.54035 6.47144 7.25869C6.74048 6.97751 6.875 6.63934 6.875 6.24416C6.875 5.84898 6.74048 5.51056 6.47144 5.22891C6.20194 4.94773 5.87813 4.80714 5.5 4.80714C5.12187 4.80714 4.79829 4.94773 4.52925 5.22891C4.25975 5.51056 4.125 5.84898 4.125 6.24416C4.125 6.63934 4.25975 6.97751 4.52925 7.25869C4.79829 7.54035 5.12187 7.68117 5.5 7.68117ZM5.5 14.5968C5.40833 14.5968 5.31667 14.5788 5.225 14.5429C5.13333 14.507 5.05312 14.4591 4.98438 14.3992C3.31146 12.8544 2.0625 11.4205 1.2375 10.0975C0.4125 8.77402 0 7.53747 0 6.38786C0 4.59159 0.552979 3.16056 1.65894 2.09477C2.76444 1.02899 4.04479 0.496094 5.5 0.496094C6.95521 0.496094 8.23556 1.02899 9.34106 2.09477C10.447 3.16056 11 4.59159 11 6.38786C11 7.53747 10.5875 8.77402 9.7625 10.0975C8.9375 11.4205 7.68854 12.8544 6.01562 14.3992C5.94688 14.4591 5.86667 14.507 5.775 14.5429C5.68333 14.5788 5.59167 14.5968 5.5 14.5968Z";
    private static final String SOUND_INACTIVE_PATH = "M4.69516 7.17147L0.157163 1.4879C-0.0906157 1.17757 -0.0399097 0.725135 0.270418 0.477357C0.580746 0.229578 1.03318 0.280285 1.28096 0.590612L19.0375 22.8296C19.2852 23.1399 19.2345 23.5923 18.9242 23.8401C18.6139 24.0879 18.1614 24.0372 17.9137 23.7269L14.9173 19.974H6.65421C6.11547 19.974 5.65444 19.7789 5.27112 19.3886C4.8878 18.9983 4.69581 18.5286 4.69516 17.9794V7.17147ZM13.3246 17.9794H6.65421V9.62506L9.5931 13.3058C9.26638 13.7065 9.10303 14.1839 9.10303 14.738C9.10303 15.3697 9.31526 15.9016 9.73972 16.3338C10.1642 16.766 10.6866 16.982 11.307 16.982C11.6862 16.982 12.0288 16.9013 12.3349 16.7398L13.3246 17.9794ZM12.5314 11.7216L13.5109 12.9484V10.998H16.4495V9.00336H12.5314V11.7216ZM18.4085 17.9794H17.5278L19.0402 19.8735C19.3177 19.7788 19.5685 19.6172 19.7926 19.3886C20.1759 18.9977 20.3676 18.5279 20.3676 17.9794V6.01135L14.4904 0.0273438H6.65421C6.11612 0.0280086 5.65509 0.223486 5.27112 0.613777C4.9134 0.977381 4.72231 1.40966 4.69785 1.9106L6.65421 4.36083V2.02201H13.5109V7.00869H18.4085V17.9794Z";
    private static final String SOUND_PATH = "M7.47457 17.5108C8.0903 17.5108 8.60882 17.2891 9.03011 16.8456C9.45141 16.4022 9.66205 15.8564 9.66205 15.2082V11.3705H12.5787V9.32375H8.68984V13.2894C8.5116 13.1529 8.32137 13.0547 8.11915 12.9946C7.91692 12.9346 7.70206 12.9049 7.47457 12.9056C6.85883 12.9056 6.34031 13.1273 5.91902 13.5708C5.49773 14.0143 5.28708 14.5601 5.28708 15.2082C5.28708 15.8564 5.49773 16.4022 5.91902 16.8456C6.34031 17.2891 6.85883 17.5108 7.47457 17.5108ZM2.85654 20.581C2.32182 20.581 1.86423 20.3807 1.48377 19.9803C1.10331 19.5798 0.912758 19.0978 0.912109 18.5342V2.16005C0.912109 1.59719 1.10266 1.11552 1.48377 0.715032C1.86488 0.314547 2.32247 0.113964 2.85654 0.113281H10.6343L16.4676 6.25359V18.5342C16.4676 19.0971 16.2773 19.5791 15.8969 19.9803C15.5164 20.3814 15.0585 20.5817 14.5231 20.581H2.85654ZM9.66205 7.27698V2.16005H2.85654V18.5342H14.5231V7.27698H9.66205Z";
    private static final String VIDEO_INACTIVE_PATH = "M1.47169 0.268979C1.15181 -0.073225 0.615089 -0.0913252 0.272885 0.228551C-0.0693189 0.548427 -0.0874188 1.08515 0.232457 1.42735L4.02634 5.48605C3.77761 5.82348 3.65324 6.21125 3.65324 6.64936V18.6494C3.65391 19.2 3.84991 19.671 4.24124 20.0624C4.63258 20.4537 5.10324 20.6494 5.65324 20.6494H9.65324V22.6494H17.6532V20.6494H18.2003L22.2917 25.0264C22.6116 25.3686 23.1483 25.3867 23.4906 25.0668C23.8328 24.747 23.8509 24.2102 23.531 23.868L1.47169 0.268979ZM13.5115 15.6333L11.1532 13.1104V17.1494L13.5115 15.6333ZM18.1532 12.6494L16.3497 13.8088L22.5506 20.4425C22.7356 20.3481 22.9075 20.2214 23.0662 20.0624C23.4576 19.6704 23.6532 19.1994 23.6532 18.6494V6.64936C23.6539 6.10003 23.4582 5.62936 23.0662 5.23736C22.6742 4.84536 22.2032 4.64936 21.6532 4.64936H7.78795L11.1532 8.24956V8.14936L18.1532 12.6494Z";
    private static final String VIDEO_PATH = "M7.50391 12.5L14.5039 8L7.50391 3.5V12.5ZM6.00391 18V16H2.00391C1.45391 16 0.98324 15.8043 0.591906 15.413C0.200573 15.0217 0.00457292 14.5507 0.00390625 14V2C0.00390625 1.45 0.199906 0.979333 0.591906 0.588C0.983906 0.196667 1.45457 0.000666667 2.00391 0H18.0039C18.5539 0 19.0249 0.196 19.4169 0.588C19.8089 0.98 20.0046 1.45067 20.0039 2V14C20.0039 14.55 19.8082 15.021 19.4169 15.413C19.0256 15.805 18.5546 16.0007 18.0039 16H14.0039V18H6.00391Z";
    private static final String VIDEO_PLAY_PATH = "M 12.4313 0.1625 C 10.0208 0.1625 7.6645 0.8773 5.6602 2.2165 C 3.656 3.5556 2.0939 5.4591 1.1715 7.6861 C 0.249 9.913 0.0077 12.3635 0.4779 14.7277 C 0.9482 17.0918 2.1089 19.2634 3.8134 20.9679 C 5.5179 22.6723 7.6894 23.8331 10.0536 24.3033 C 12.4177 24.7736 14.8682 24.5322 17.0952 23.6098 C 19.3222 22.6873 21.2256 21.1252 22.5648 19.121 C 23.904 17.1168 24.6188 14.7605 24.6188 12.35 C 24.6188 9.1177 23.3347 6.0177 21.0491 3.7321 C 18.7635 1.4465 15.6636 0.1625 12.4313 0.1625 Z M 18.9141 13.1291 L 8.4677 18.3523 C 8.335 18.4187 8.1874 18.45 8.0392 18.4433 C 7.8909 18.4365 7.7469 18.392 7.6206 18.314 C 7.4944 18.2359 7.3903 18.1269 7.3181 17.9972 C 7.2458 17.8676 7.208 17.7216 7.208 17.5732 V 7.1268 C 7.2081 6.9785 7.2461 6.8326 7.3184 6.7031 C 7.3907 6.5735 7.4948 6.4646 7.621 6.3867 C 7.7472 6.3087 7.8912 6.2643 8.0394 6.2576 C 8.1876 6.2509 8.335 6.2822 8.4677 6.3485 L 18.9141 11.5718 C 19.0586 11.6441 19.18 11.7553 19.2648 11.8927 C 19.3497 12.0301 19.3946 12.1885 19.3946 12.35 C 19.3946 12.5115 19.3497 12.6699 19.2648 12.8073 C 19.18 12.9447 19.0586 13.0559 18.9141 13.1282";

    public static SVGPath createSVGPath(String path) {
        SVGPath svgPath = new SVGPath();
        svgPath.setContent(path);
        return svgPath;
    }

    public static SVGPath createStrokeSVGPath(String path, Paint stroke, double strokeWidth) {
        return createSVGPath(path, null, stroke, strokeWidth);
    }

    public static SVGPath setSVGPathFill(SVGPath svgPath, Paint fill) {
        svgPath.setFill(fill);
        return svgPath;
    }

    public static SVGPath setSVGPathStroke(SVGPath svgPath, Paint stroke, double strokeWidth) {
        svgPath.setStroke(stroke);
        svgPath.setStrokeWidth(strokeWidth);
        return svgPath;
    }

    public static SVGPath createSVGPath(String path, Paint fill, Paint stroke, double strokeWidth) {
        return setSVGPathFillStroke(createSVGPath(path), fill, stroke, strokeWidth);
    }

    public static SVGPath setSVGPathFillStroke(SVGPath svgPath, Paint fill, Paint stroke, double strokeWidth) {
        svgPath.setFill(fill);
        return setSVGPathStroke(svgPath, stroke, strokeWidth);
    }

    public static MonoPane createButtonPane(Node buttonContent) {
        return new MonoPane(buttonContent);
    }

    public static MonoPane createButtonPane(Node buttonContent, Runnable onClicked) {
        return armButton(createButtonPane(buttonContent), onClicked);
    }

    public static <N extends Node> N armButton(N buttonNode, Runnable onClicked) {
        buttonNode.setCursor(onClicked == null ? Cursor.DEFAULT : Cursor.HAND);
        buttonNode.setOnMouseClicked(onClicked == null ? null : e -> onClicked.run());
        return buttonNode;
    }

    public static MonoPane createToggleButtonPane(Node trueContent, Node falseContent, Supplier<Boolean> stateGetter, Consumer<Boolean> stateSetter) {
        MonoPane monoPane = new MonoPane(stateGetter.get() ? trueContent : falseContent);
        return armButton(monoPane, () -> {
            boolean oldState = stateGetter.get();
            boolean newState = !oldState;
            stateSetter.accept(newState);
            newState = stateGetter.get();
            monoPane.setContent(newState ? trueContent : falseContent);
        });
    }

    public static MonoPane createToggleButtonPane(Node trueContent, Node falseContent, boolean initialState, Consumer<Boolean> onClicked) {
        boolean[] state = { initialState };
        return createToggleButtonPane(trueContent, falseContent, () -> state[0], newState -> {
            state[0] = newState;
            onClicked.accept(newState);
        });
    }

    public static SVGPath createTrashSVGPath() {
        return createSVGPath(TRASH_PATH);
    }

    public static SVGPath createPinpointSVGPath() {
        return createSVGPath(PINPOINT_PATH);
    }

    public static SVGPath createPlusPath() {
        return createSVGPath(PLUS_PATH);
    }

    public static SVGPath createMinusPath() {
        return createSVGPath(MINUS_PATH);
    }

    public static SVGPath createTopArrowPath() {
        return createSVGPath(TOP_ARROW_PATH);
    }

    public static SVGPath createBottomArrowPath() {
        return createSVGPath(BOTTOM_ARROW_PATH);
    }

    public static SVGPath createSoundIconInactivePath() {
        return createSVGPath(SOUND_INACTIVE_PATH);
    }

    public static SVGPath createSoundIconPath() {
        return createSVGPath(SOUND_PATH);
    }

    public static SVGPath createVideoIconInactivePath() {
        return createSVGPath(VIDEO_INACTIVE_PATH);
    }

    public static SVGPath createVideoIconPath() {
        return createSVGPath(VIDEO_PATH);
    }

    public static SVGPath createBackArrow() {
        return createSVGPath(BACK_ARROW_PATH);
    }

    public static SVGPath createVideoPlaySVGPath() {
        return createSVGPath(VIDEO_PLAY_PATH);
    }
}


