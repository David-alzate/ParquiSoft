package co.parquisoft.domain.parkings.country.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class CountryDoesNotExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public CountryDoesNotExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static CountryDoesNotExistsException create() {
        var userMessage = "La ciudad no existe";
        return new CountryDoesNotExistsException(userMessage);
    }
}
