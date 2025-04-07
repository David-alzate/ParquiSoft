package co.parquisoft.crosscutting.exception;

import co.parquisoft.crosscutting.exception.enums.Layer;

public class EntityParquiSoftException extends ParquiSoftException {

    private static final long serialVersionUID = 1L;

    public EntityParquiSoftException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.ENTITY, rootException);
    }

    public static final EntityParquiSoftException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new EntityParquiSoftException(userMessage, technicalMessage, rootException);
    }

    public static final EntityParquiSoftException create(final String userMessage) {
        return new EntityParquiSoftException(userMessage, userMessage, new Exception());
    }

    public static final EntityParquiSoftException create(final String userMessage, final String technicalMessage) {
        return new EntityParquiSoftException(userMessage, technicalMessage, new Exception());
    }
}
