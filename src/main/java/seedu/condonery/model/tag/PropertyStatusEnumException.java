package seedu.condonery.model.tag;

import seedu.condonery.commons.exceptions.IllegalValueException;

public class PropertyStatusEnumException extends IllegalValueException {

    public PropertyStatusEnumException(String message) {
        super(message);
    }

    public PropertyStatusEnumException(String message, Throwable cause) {
        super(message, cause);
    }
}
