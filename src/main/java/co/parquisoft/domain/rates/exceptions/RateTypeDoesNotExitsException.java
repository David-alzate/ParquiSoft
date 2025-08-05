package co.parquisoft.domain.rates.exceptions;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class RateTypeDoesNotExitsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public RateTypeDoesNotExitsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static RateTypeDoesNotExitsException create() {
        var userMessage = "El tipo de tarifa no existe";
        return new RateTypeDoesNotExitsException(userMessage);
    }
}
