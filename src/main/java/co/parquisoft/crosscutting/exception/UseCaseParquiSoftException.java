package co.parquisoft.crosscutting.exception;

import co.parquisoft.crosscutting.exception.enums.Layer;

public class UseCaseParquiSoftException extends ParquiSoftException {

    private static final long serialVersionUID = 1L;

    public UseCaseParquiSoftException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.USECASE, rootException);
    }

    public static final UseCaseParquiSoftException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new UseCaseParquiSoftException(userMessage, technicalMessage, rootException);
    }

    public static final UseCaseParquiSoftException create(final String userMessage) {
        return new UseCaseParquiSoftException(userMessage, userMessage, new Exception());
    }

    public static final UseCaseParquiSoftException create(final String userMessage, final String technicalMessage) {
        return new UseCaseParquiSoftException(userMessage, technicalMessage, new Exception());
    }
}
