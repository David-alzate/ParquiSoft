package co.parquisoft.domain.commons.status.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class StatusDoesNotExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public StatusDoesNotExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static StatusDoesNotExistsException create() {
        var userMessage = "El estado no existe";
        return new StatusDoesNotExistsException(userMessage);
    }
}
