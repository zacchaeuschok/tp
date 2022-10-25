package seedu.condonery.testutil;

import static seedu.condonery.logic.commands.CommandTestUtil.CLIENT_VALID_ADDRESS_BOB;
import static seedu.condonery.logic.commands.CommandTestUtil.CLIENT_VALID_NAME_BOB;
import static seedu.condonery.logic.commands.CommandTestUtil.CLIENT_VALID_TAG_FRIEND;
import static seedu.condonery.logic.commands.CommandTestUtil.CLIENT_VALID_TAG_HUSBAND;
import static seedu.condonery.logic.commands.CommandTestUtil.PROPERTY_ADDRESS_DESC_SCOTTS;
import static seedu.condonery.logic.commands.CommandTestUtil.PROPERTY_ADDRESS_DESC_WHISTLER;
import static seedu.condonery.logic.commands.CommandTestUtil.PROPERTY_NAME_DESC_SCOTTS;
import static seedu.condonery.logic.commands.CommandTestUtil.PROPERTY_NAME_DESC_WHISTLER;
import static seedu.condonery.logic.commands.CommandTestUtil.PROPERTY_STATUS_DESC_WHISTLER;
import static seedu.condonery.logic.commands.CommandTestUtil.PROPERTY_TAGS_DESC_SCOTTS;
import static seedu.condonery.logic.commands.CommandTestUtil.PROPERTY_TAGS_DESC_WHISTLER;
import static seedu.condonery.logic.commands.CommandTestUtil.PROPERTY_VALID_ADDRESS_SCOTTS;
import static seedu.condonery.logic.commands.CommandTestUtil.PROPERTY_VALID_ADDRESS_WHISTLER;
import static seedu.condonery.logic.commands.CommandTestUtil.PROPERTY_VALID_NAME_SCOTTS;
import static seedu.condonery.logic.commands.CommandTestUtil.PROPERTY_VALID_NAME_WHISTLER;
import static seedu.condonery.logic.commands.CommandTestUtil.PROPERTY_VALID_STATUS;
import static seedu.condonery.logic.commands.CommandTestUtil.PROPERTY_VALID_TAG;
import static seedu.condonery.logic.commands.CommandTestUtil.PROPERTY_VALID_TAG_SCOTTS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.condonery.model.PropertyDirectory;
import seedu.condonery.model.property.Property;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalProperties {

    public static final Property PINNACLE = new PropertyBuilder().withName("Pinnacle@Duxton")
            .withAddress("123, Jurong West Ave 6, #08-111")
            .withTags("friends").build();
    public static final Property OASIS = new PropertyBuilder().withName("Oasis")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withTags("owesMoney", "friends").build();
    public static final Property CARL = new PropertyBuilder().withName("Carl Kurz").withAddress("wall street").build();
    public static final Property DANIEL = new PropertyBuilder()
            .withName("Daniel Meier").withAddress("10th street").withTags("friends").build();
    public static final Property ELLE = new PropertyBuilder().withName("Elle Meyer")
            .withAddress("michegan ave").build();
    public static final Property FIONA = new PropertyBuilder().withName("Fiona Kunz")
            .withAddress("little tokyo").build();
    public static final Property GEORGE = new PropertyBuilder().withName("George Best")
            .withAddress("4th street").build();

    // Manually added
    public static final Property HOON = new PropertyBuilder().withName("Hoon Meier")
            .withAddress("little india").build();
    public static final Property IDA = new PropertyBuilder().withName("Ida Mueller")
            .withAddress("chicago ave").build();

    // Manually added - Property's details found in {@code CommandTestUtil}
    public static final Property SCOTTS = new PropertyBuilder()
            .withName(PROPERTY_VALID_NAME_SCOTTS)
            .withAddress(PROPERTY_VALID_ADDRESS_SCOTTS)
            .withTags(PROPERTY_VALID_TAG_SCOTTS)
            .withPropertyStatus(PROPERTY_VALID_STATUS)
            .build();
    public static final Property WHISTLER = new PropertyBuilder()
            .withName(PROPERTY_VALID_NAME_WHISTLER)
            .withAddress(PROPERTY_VALID_ADDRESS_WHISTLER)
            .withTags(PROPERTY_VALID_TAG)
            .withPropertyStatus(PROPERTY_VALID_STATUS)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalProperties() {
    } // prevents instantiation

    /**
     * Returns an {@code PropertyDirectory} with all the typical persons.
     */
    public static PropertyDirectory getTypicalPropertyDirectory() {
        PropertyDirectory pd = new PropertyDirectory();
        for (Property property: getTypicalProperties()) {
            pd.addProperty(property);
        }
        return pd;
    }

    public static List<Property> getTypicalProperties() {
        return new ArrayList<>(Arrays.asList(PINNACLE, OASIS, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
