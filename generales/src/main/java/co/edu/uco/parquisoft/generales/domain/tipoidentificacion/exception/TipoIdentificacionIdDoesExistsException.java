package co.edu.uco.parquisoft.generales.domain.tipoidentificacion.exception;

import co.edu.uco.parquisoft.generales.crosscutting.exception.enums.RuleGeneralesException;

public class TipoIdentificacionIdDoesExistsException extends RuleGeneralesException {

    private static final long serialVersionUID=1l;

    public TipoIdentificacionIdDoesExistsException(String userMessage) {
        super(userMessage, userMessage, new Exception());
    }

    public static final TipoIdentificacionIdDoesExistsException create(){
        var userMessage= "Ya existe un Tipo de Identificacion con ese Id";
        return  new TipoIdentificacionIdDoesExistsException(userMessage);
    }
}
