package seedu.condonery.ui;

import java.io.File;
import java.nio.file.Path;
import java.util.Comparator;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import seedu.condonery.model.property.Property;
import seedu.condonery.model.tag.PropertyStatusEnum;

/**
 * An UI component that displays information of a {@code Property}.
 */
public class PropertyCard extends UiPart<Region> {

    private static final String FXML = "PropertyListCard.fxml";
    private static final String DEFAULT_PROPERTY_IMAGE = "/images/PropertyDisplay.png";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on PropertyDirectory level 4</a>
     */

    public final Property property;

    @FXML
    private HBox cardPane;
    @FXML
    private Label name;
    @FXML
    private Label id;
    @FXML
    private Label address;
    @FXML
    private Label price;
    @FXML
    private FlowPane tags;
    @FXML
    private ImageView displayPicture;
    @FXML
    private Label propertyStatus;

    /**
     * Creates a {@code PropertyCode} with the given {@code Property} and index to display.
     */
    public PropertyCard(Property property, int displayedIndex) {
        super(FXML);
        this.property = property;
        id.setText(displayedIndex + ". ");
        name.setText(property.getName().fullName);
        address.setText(property.getAddress().value);
        price.setText("$" + property.getPrice().value);
        property.getTags().stream()
                .sorted(Comparator.comparing(tag -> tag.tagName))
                .forEach(tag -> tags.getChildren().add(new Label(tag.tagName)));
        displayPicture.setClip(new Circle(40, 40, 40));
        propertyStatus.setText(property.getPropertyStatusEnum().toString());
        propertyStatus.setBackground(new Background(new BackgroundFill(propertyStatusColor(property.getPropertyStatusEnum()), CornerRadii.EMPTY, Insets.EMPTY)));
        Path imagePath = property.getImagePath();
        if (imagePath != null) {
            File file = new File(property.getImagePath().toString());
            if (file.exists()) {
                Image img = new Image(file.toURI().toString());
                displayPicture.setImage(img);
            } else {
                Image img = new Image(this.getClass().getResourceAsStream(DEFAULT_PROPERTY_IMAGE));
                displayPicture.setImage(img);
            }
        }
    }

    Color propertyStatusColor(PropertyStatusEnum propertyStatusEnum) {
        switch (propertyStatusEnum){
            case SOLD:
                return Color.RED;
            case AVAILABLE:
                return Color.rgb(0, 255,0);
            case PENDING:
                return Color.rgb(255,255,0);
            default:
                return Color.rgb(0,0,0);
        }
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof PropertyCard)) {
            return false;
        }

        // state check
        PropertyCard card = (PropertyCard) other;
        return id.getText().equals(card.id.getText())
                && property.equals(card.property);
    }
}
