package co.parquisoft.domain.commons.idtype.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class IdTypeDoesExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public IdTypeDoesExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static IdTypeDoesExistsException create() {
        var userMessage = "Ya existe un Tipo de Identificacion con ese Id";
        return new IdTypeDoesExistsException(userMessage);
    }
}
