package co.parquisoft.domain.commons.status.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class StatusDoesExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public StatusDoesExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static StatusDoesExistsException create() {
        var userMessage = "Ya existe un estado con ese Id";
        return new StatusDoesExistsException(userMessage);
    }
}
