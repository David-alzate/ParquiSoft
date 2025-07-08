package co.parquisoft.domain.parkings.branch.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class BranchDoesExistsException extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public BranchDoesExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static BranchDoesExistsException create() {
        var userMessage = "La sede ya existe";
        return new BranchDoesExistsException(userMessage);
    }
}
