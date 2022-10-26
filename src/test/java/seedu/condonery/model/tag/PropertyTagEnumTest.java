package seedu.condonery.model.tag;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PropertyTagEnumTest {

    @Test
    public void propertyTagEnum_stringToEnum_convertedSuccessfully() {
        String propertyTagValue = "HDB";
        PropertyTypeEnum propertyTypeEnum = PropertyTypeEnum.valueOf(propertyTagValue);
        assertEquals(propertyTypeEnum, PropertyTypeEnum.HDB);
    }
}
