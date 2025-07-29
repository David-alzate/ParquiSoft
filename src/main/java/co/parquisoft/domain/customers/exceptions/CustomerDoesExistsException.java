package co.parquisoft.domain.customers.exceptions;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class CustomerDoesExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public CustomerDoesExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static CustomerDoesExistsException create() {
        var userMessage = "El cliente ya existe con el Id indicado";
        return new CustomerDoesExistsException(userMessage);
    }
}
