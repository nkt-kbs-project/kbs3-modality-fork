package one.modality.base.client.brand;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import dev.webfx.platform.resource.Resource;

/**
 * @author Bruno Salmon
 */
public class Brand {

    // Design hesitating between blue #0096D6 and orange #F6782E
    private static final Color BLUE_COLOR = Color.web("#0096D6");
    private static final Color ORANGE_COLOR = Color.web("#F6782E");
    private static final Color BRAND_MAIN_COLOR = ORANGE_COLOR;
    private static final Color BRAND_MAIN_BACKGROUND_COLOR = ORANGE_COLOR;

    //TODO: update application code to stop using these methods from Java and rely only on CSS and i18n

    public static Color getBlueColor() {
        return BLUE_COLOR;
    }

    public static Color getOrangeColor() {
        return ORANGE_COLOR;
    }

    public static Color getBrandMainColor() {
        return BRAND_MAIN_COLOR;
    }

    public static Color getBrandMainBackgroundColor() {
        return BRAND_MAIN_BACKGROUND_COLOR;
    }

    public static Node createModalityBackOfficeBrandNode() {
        ImageView logo = new ImageView(Resource.toUrl("modality-logo.png", Brand.class));
        Text modality = new Text("modality");
        Text one = new Text("one");
        modality.setFont(Font.font("Montserrat", FontWeight.NORMAL, 18));
        one.setFont(Font.font("Montserrat", FontWeight.BOLD, 18));
        modality.setFill(Color.web("4D4D4D"));
        one.setFill(Color.web("1589BF"));
        HBox brand = new HBox(logo, modality, one);
        HBox.setMargin(logo, new Insets(0, 3, 0, 0)); // 3px gap between logo and text
        brand.setAlignment(Pos.CENTER);
        return brand;
    }

}
