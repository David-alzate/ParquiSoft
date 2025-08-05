package co.parquisoft.domain.rates.exceptions;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class RateTypeDoesExitsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public RateTypeDoesExitsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static RateTypeDoesExitsException create() {
        var userMessage = "El tipo de tarifa ya existe";
        return new RateTypeDoesExitsException(userMessage);
    }
}
