package co.parquisoft.crosscutting.exception;

import co.parquisoft.crosscutting.exception.enums.Layer;

public class ApplicationParquiSoftException extends ParquiSoftException {

    private static final long serialVersionUID = 1L;

    public ApplicationParquiSoftException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.APPLICATION, rootException);
    }

    public static final ApplicationParquiSoftException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new ApplicationParquiSoftException(userMessage, technicalMessage, rootException);
    }

    public static final ApplicationParquiSoftException create(final String userMessage) {
        return new ApplicationParquiSoftException(userMessage, userMessage, new Exception());
    }

    public static final ApplicationParquiSoftException create(final String userMessage, final String technicalMessage) {
        return new ApplicationParquiSoftException(userMessage, technicalMessage, new Exception());
    }
}
