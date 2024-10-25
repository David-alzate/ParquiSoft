package co.edu.uco.parquisoft.generales.domain.tipoidentificacion.rules.impl;

import co.edu.uco.parquisoft.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.parquisoft.generales.domain.tipoidentificacion.exception.TipoIdentificacionIdIsNullException;
import co.edu.uco.parquisoft.generales.domain.tipoidentificacion.rules.TipoIdentificacionIdIsNotNullRule;

import java.util.UUID;

public class TipoIdentificacionIdIsNotNullRuleImpl implements TipoIdentificacionIdIsNotNullRule {
    @Override
    public void validate(final UUID data) {
        if(ObjectHelper.isNull(data)){
            throw TipoIdentificacionIdIsNullException.create();
        }

    }
}
