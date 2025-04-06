package co.parquisoft.crosscutting.exception.enums;

public class RuleGeneralesException extends GeneralesException{

    private static final long serialVersionUID = 1L;

    public RuleGeneralesException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.RULE, rootException);
    }

    public static final RuleGeneralesException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new RuleGeneralesException(userMessage, technicalMessage, rootException);
    }

    public static final RuleGeneralesException create(final String userMessage) {
        return new RuleGeneralesException(userMessage, userMessage, new Exception());
    }

    public static final RuleGeneralesException create(final String userMessage, final String technicalMessage) {
        return new RuleGeneralesException(userMessage, technicalMessage, new Exception());
    }
}
