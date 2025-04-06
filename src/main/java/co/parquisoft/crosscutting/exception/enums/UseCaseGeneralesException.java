package co.parquisoft.crosscutting.exception.enums;

public class UseCaseGeneralesException extends GeneralesException{

    private static final long serialVersionUID = 1L;

    public UseCaseGeneralesException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.USECASE, rootException);
    }

    public static final UseCaseGeneralesException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new UseCaseGeneralesException(userMessage, technicalMessage, rootException);
    }

    public static final UseCaseGeneralesException create(final String userMessage) {
        return new UseCaseGeneralesException(userMessage, userMessage, new Exception());
    }

    public static final UseCaseGeneralesException create(final String userMessage, final String technicalMessage) {
        return new UseCaseGeneralesException(userMessage, technicalMessage, new Exception());
    }
}
