package co.parquisoft.domain.parkings.branch.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class BranchDoesNotExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public BranchDoesNotExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static BranchDoesNotExistsException create() {
        var userMessage = "La sede no existe";
        return new BranchDoesNotExistsException(userMessage);
    }
}
