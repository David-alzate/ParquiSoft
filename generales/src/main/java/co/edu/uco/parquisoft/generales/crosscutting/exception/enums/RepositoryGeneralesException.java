package co.edu.uco.parquisoft.generales.crosscutting.exception.enums;

public class RepositoryGeneralesException extends GeneralesException{

    private static final long serialVersionUID = 1L;

    public RepositoryGeneralesException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.REPOSITORY, rootException);
    }

    public static final RepositoryGeneralesException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new RepositoryGeneralesException(userMessage, technicalMessage, rootException);
    }

    public static final RepositoryGeneralesException create(final String userMessage) {
        return new RepositoryGeneralesException(userMessage, userMessage, new Exception());
    }

    public static final RepositoryGeneralesException create(final String userMessage, final String technicalMessage) {
        return new RepositoryGeneralesException(userMessage, technicalMessage, new Exception());
    }
}
