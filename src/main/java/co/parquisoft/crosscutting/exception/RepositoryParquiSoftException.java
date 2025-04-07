package co.parquisoft.crosscutting.exception;

import co.parquisoft.crosscutting.exception.enums.Layer;

public class RepositoryParquiSoftException extends ParquiSoftException {

    private static final long serialVersionUID = 1L;

    public RepositoryParquiSoftException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.REPOSITORY, rootException);
    }

    public static final RepositoryParquiSoftException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new RepositoryParquiSoftException(userMessage, technicalMessage, rootException);
    }

    public static final RepositoryParquiSoftException create(final String userMessage) {
        return new RepositoryParquiSoftException(userMessage, userMessage, new Exception());
    }

    public static final RepositoryParquiSoftException create(final String userMessage, final String technicalMessage) {
        return new RepositoryParquiSoftException(userMessage, technicalMessage, new Exception());
    }
}
