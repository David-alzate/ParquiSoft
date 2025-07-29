package co.parquisoft.domain.customers.exceptions;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class CustomerDoesNotExsitsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public CustomerDoesNotExsitsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static CustomerDoesNotExsitsException create() {
        var userMessage = "No Existe el cliente con el Id indicado";
        return new CustomerDoesNotExsitsException(userMessage);
    }
}
