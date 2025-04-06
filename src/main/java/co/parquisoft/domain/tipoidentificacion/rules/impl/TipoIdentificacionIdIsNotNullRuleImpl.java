package co.parquisoft.domain.tipoidentificacion.rules.impl;

import co.parquisoft.crosscutting.helpers.ObjectHelper;
import co.parquisoft.domain.tipoidentificacion.exception.TipoIdentificacionIdIsNullException;
import co.parquisoft.domain.tipoidentificacion.rules.TipoIdentificacionIdIsNotNullRule;

import java.util.UUID;

public class TipoIdentificacionIdIsNotNullRuleImpl implements TipoIdentificacionIdIsNotNullRule {
    @Override
    public void validate(final UUID data) {
        if(ObjectHelper.isNull(data)){
            throw TipoIdentificacionIdIsNullException.create();
        }

    }
}
