package co.edu.uco.parquisoft.generales.domain.tipoidentificacion.exception;

import co.edu.uco.parquisoft.generales.crosscutting.exception.enums.RuleGeneralesException;

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
