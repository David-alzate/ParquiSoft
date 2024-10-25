package co.edu.uco.parquisoft.generales.domain.tipoidentificacion.exception;

import co.edu.uco.parquisoft.generales.crosscutting.exception.enums.RuleGeneralesException;

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
