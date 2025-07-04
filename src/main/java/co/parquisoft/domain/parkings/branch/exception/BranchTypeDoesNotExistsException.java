package co.parquisoft.domain.parkings.branch.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class BranchTypeDoesNotExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public BranchTypeDoesNotExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static BranchTypeDoesNotExistsException create() {
        var userMessage = "El tipo de sede no existe";
        return new BranchTypeDoesNotExistsException(userMessage);
    }
}
