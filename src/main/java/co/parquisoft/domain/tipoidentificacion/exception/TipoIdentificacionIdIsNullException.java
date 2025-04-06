package co.parquisoft.domain.tipoidentificacion.exception;

import co.parquisoft.crosscutting.exception.enums.RuleGeneralesException;

public class TipoIdentificacionIdIsNullException extends RuleGeneralesException {

    private static final long serialVersionUID=1l;

    public TipoIdentificacionIdIsNullException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static final TipoIdentificacionIdIsNullException create(){
        var userMessage= "El Id del Tipo de identificación no puede ser nulo";
        return  new TipoIdentificacionIdIsNullException(userMessage);
    }
}
