package co.parquisoft.domain.tipoidentificacion.rules.impl;

import co.parquisoft.application.secondaryports.repository.TipoIdentificacionRepository;
import co.parquisoft.domain.tipoidentificacion.exception.TipoIdentificacionIdDoesExistsException;
import co.parquisoft.domain.tipoidentificacion.rules.TipoIdentificacionIdDoesExistsRule;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class TipoIdentificacionIdDoesNotExistsRuleImpl implements TipoIdentificacionIdDoesExistsRule {

    private TipoIdentificacionRepository tipoIdentificacionRepository;

    @Autowired
    public TipoIdentificacionIdDoesNotExistsRuleImpl(final TipoIdentificacionRepository tipoIdentificacionRepository){
        this.tipoIdentificacionRepository = tipoIdentificacionRepository;
    }

    @Override
    public void validate(final UUID data) {
        if(tipoIdentificacionRepository.existsById(data)){
            throw TipoIdentificacionIdDoesExistsException.create();
        }
    }
}
