package co.parquisoft.domain.commons.idtype.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class IdTypeDoesNotExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public IdTypeDoesNotExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static IdTypeDoesNotExistsException create() {
        var userMessage = "No Existe la ciudad con el Id indicado";
        return new IdTypeDoesNotExistsException(userMessage);
    }
}
