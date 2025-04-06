package co.parquisoft.crosscutting.exception.enums;

public class EntityGeneralesException extends GeneralesException{

    private static final long serialVersionUID = 1L;

    public EntityGeneralesException(final String userMessage, final String technicalMessage, final Exception rootException) {
        super(userMessage, technicalMessage, Layer.ENTITY, rootException);
    }

    public static final EntityGeneralesException create(final String userMessage, final String technicalMessage, final Exception rootException) {
        return new EntityGeneralesException(userMessage, technicalMessage, rootException);
    }

    public static final EntityGeneralesException create(final String userMessage) {
        return new EntityGeneralesException(userMessage, userMessage, new Exception());
    }

    public static final EntityGeneralesException create(final String userMessage, final String technicalMessage) {
        return new EntityGeneralesException(userMessage, technicalMessage, new Exception());
    }
}
