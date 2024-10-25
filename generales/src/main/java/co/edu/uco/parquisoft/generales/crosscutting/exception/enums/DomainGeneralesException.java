package co.edu.uco.parquisoft.generales.crosscutting.exception.enums;

public class DomainGeneralesException extends GeneralesException{

    private static final long serialVersionUID = 1L;

    public DomainGeneralesException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.DOMAIN, rootException);
    }

    public static final DomainGeneralesException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new DomainGeneralesException(userMessage, technicalMessage, rootException);
    }

    public static final DomainGeneralesException create(final String userMessage) {
        return new DomainGeneralesException(userMessage, userMessage, new Exception());
    }

    public static final DomainGeneralesException create(final String userMessage, final String technicalMessage) {
        return new DomainGeneralesException(userMessage, technicalMessage, new Exception());
    }
}
