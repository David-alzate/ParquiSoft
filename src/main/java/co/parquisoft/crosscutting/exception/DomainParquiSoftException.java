package co.parquisoft.crosscutting.exception;

import co.parquisoft.crosscutting.exception.enums.Layer;

public class DomainParquiSoftException extends ParquiSoftException {

    private static final long serialVersionUID = 1L;

    public DomainParquiSoftException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.DOMAIN, rootException);
    }

    public static final DomainParquiSoftException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new DomainParquiSoftException(userMessage, technicalMessage, rootException);
    }

    public static final DomainParquiSoftException create(final String userMessage) {
        return new DomainParquiSoftException(userMessage, userMessage, new Exception());
    }

    public static final DomainParquiSoftException create(final String userMessage, final String technicalMessage) {
        return new DomainParquiSoftException(userMessage, technicalMessage, new Exception());
    }
}
