package co.parquisoft.crosscutting.exception;

import co.parquisoft.crosscutting.exception.enums.Layer;

public class DTOParquiSoftException extends ParquiSoftException {

    private static final long serialVersionUID = 1L;

    public DTOParquiSoftException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.DTO, rootException);
    }

    public static final DTOParquiSoftException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new DTOParquiSoftException(userMessage, technicalMessage, rootException);
    }

    public static final DTOParquiSoftException create(final String userMessage) {
        return new DTOParquiSoftException(userMessage, userMessage, new Exception());
    }

    public static final DTOParquiSoftException create(final String userMessage, final String technicalMessage) {
        return new DTOParquiSoftException(userMessage, technicalMessage, new Exception());
    }
}
