package co.edu.uco.parquisoft.generales.crosscutting.exception.enums;

public class DTOGeneralesException extends GeneralesException{

    private static final long serialVersionUID = 1L;

    public DTOGeneralesException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.DTO, rootException);
    }

    public static final DTOGeneralesException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new DTOGeneralesException(userMessage, technicalMessage, rootException);
    }

    public static final DTOGeneralesException create(final String userMessage) {
        return new DTOGeneralesException(userMessage, userMessage, new Exception());
    }

    public static final DTOGeneralesException create(final String userMessage, final String technicalMessage) {
        return new DTOGeneralesException(userMessage, technicalMessage, new Exception());
    }
}
