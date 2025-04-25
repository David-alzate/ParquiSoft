package co.parquisoft.domain.commons.status.exception;

import co.parquisoft.crosscutting.exception.RuleParquiSoftException;

public class StatusDoesExistsRuleImpl extends RuleParquiSoftException {

    private static final long serialVersionUID = 1l;

    public StatusDoesExistsRuleImpl(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static StatusDoesExistsRuleImpl create() {
        var userMessage = "Ya existe un estado con ese Id";
        return new StatusDoesExistsRuleImpl(userMessage);
    }
}
