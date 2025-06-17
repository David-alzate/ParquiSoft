package co.parquisoft.domain.parkings.state.exceptions;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class StateDoesNotExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public StateDoesNotExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static StateDoesNotExistsException create() {
        var userMessage = "El departamento no existe";
        return new StateDoesNotExistsException(userMessage);
    }
}
