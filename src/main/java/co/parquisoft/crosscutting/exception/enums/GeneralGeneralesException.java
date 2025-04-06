package co.parquisoft.crosscutting.exception.enums;

public class GeneralGeneralesException extends GeneralesException{

    private static final long serialVersionUID = 1L;

    public GeneralGeneralesException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.GENERAL, rootException);
    }

    public static final GeneralGeneralesException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new GeneralGeneralesException(userMessage, technicalMessage, rootException);
    }

    public static final GeneralGeneralesException create(final String userMessage) {
        return new GeneralGeneralesException(userMessage, userMessage, new Exception());
    }

    public static final GeneralGeneralesException create(final String userMessage, final String technicalMessage) {
        return new GeneralGeneralesException(userMessage, technicalMessage, new Exception());
    }
}
