package co.parquisoft.crosscutting.exception;

import co.parquisoft.crosscutting.exception.enums.Layer;

public class RuleParquiSoftException extends ParquiSoftException {

    private static final long serialVersionUID = 1L;

    public RuleParquiSoftException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.RULE, rootException);
    }

    public static final RuleParquiSoftException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new RuleParquiSoftException(userMessage, technicalMessage, rootException);
    }

    public static final RuleParquiSoftException create(final String userMessage) {
        return new RuleParquiSoftException(userMessage, userMessage, new Exception());
    }

    public static final RuleParquiSoftException create(final String userMessage, final String technicalMessage) {
        return new RuleParquiSoftException(userMessage, technicalMessage, new Exception());
    }
}
