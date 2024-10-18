package co.edu.uco.parquisoft.generales.crosscutting.exception.enums;

public class ApplicationGeneralesException extends GeneralesException{

    private static final long serialVersionUID = 1L;

    public ApplicationGeneralesException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.APPLICATION, rootException);
    }

    public static final ApplicationGeneralesException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new ApplicationGeneralesException(userMessage, technicalMessage, rootException);
    }

    public static final ApplicationGeneralesException create(final String userMessage) {
        return new ApplicationGeneralesException(userMessage, userMessage, new Exception());
    }

    public static final ApplicationGeneralesException create(final String userMessage, final String technicalMessage) {
        return new ApplicationGeneralesException(userMessage, technicalMessage, new Exception());
    }
}
