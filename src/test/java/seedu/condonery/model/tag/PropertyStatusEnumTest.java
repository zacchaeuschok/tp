package seedu.condonery.model.tag;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import seedu.condonery.logic.parser.exceptions.ParseException;

public class PropertyStatusEnumTest {
    @Test
    public void propertyTagEnum_upperCaseStringToEnum_convertedSuccessfully() {
        String propertyStatusValue = "AVAILABLE";
        PropertyStatusEnum propertyStatusEnum = PropertyStatusEnum.valueOf(propertyStatusValue);
        assertEquals(propertyStatusEnum, PropertyStatusEnum.AVAILABLE);
    }

    @Test
    public void propertyTagEnum_lowerCaseToEnum_convertedSuccessfully() {
        String propertyStatusValue = "available";
        assertThrows(IllegalArgumentException.class, () -> PropertyStatusEnum.valueOf(propertyStatusValue));
    }
}
