package co.parquisoft.crosscutting.exception;

import co.parquisoft.crosscutting.exception.enums.Layer;
import co.parquisoft.crosscutting.helpers.ObjectHelper;
import co.parquisoft.crosscutting.helpers.TextHelper;

public class ParquiSoftException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String userMessage;
    private Layer layer;

    public ParquiSoftException(final String userMessage, final String technicalMessage, final Layer layer, final Exception rootException) {
        super(ObjectHelper.getDefault(technicalMessage, TextHelper.applyTrim(userMessage)),
                ObjectHelper.getDefault(rootException, new Exception()));
        setLayer(layer);
        setUserMessage(userMessage);
    }

    public String getUserMessage() {
        return userMessage;
    }

    private void setUserMessage(String userMessage) {
        this.userMessage = TextHelper.applyTrim(userMessage);
    }

    public Layer getLayer() {
        return layer;
    }

    private void setLayer(Layer layer) {
        this.layer = ObjectHelper.getDefault(layer, Layer.GENERAL);
    }
}
