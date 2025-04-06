package co.parquisoft.domain.tipoidentificacion.exception;

import co.parquisoft.crosscutting.exception.enums.RuleGeneralesException;

public class TipoIdentificacionIdDoesNotExistsException extends RuleGeneralesException {

    private static final long serialVersionUID=1l;

    public TipoIdentificacionIdDoesNotExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static final TipoIdentificacionIdDoesNotExistsException create(){
        var userMessage= "No Existe la ciudad con el Id indicado";
        return  new TipoIdentificacionIdDoesNotExistsException(userMessage);
    }
}
