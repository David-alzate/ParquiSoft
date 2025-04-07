package co.parquisoft.domain.commons.idtype.rules.impl;

import co.parquisoft.application.secondaryports.repository.commons.IdTypeRepository;
import co.parquisoft.domain.commons.idtype.exception.IdTypeDoesNotExistsException;
import co.parquisoft.domain.commons.idtype.rules.IdTypeDoesExistsRule;

import java.util.UUID;

public class IdTypeDoesExistsRuleImpl implements IdTypeDoesExistsRule {

    private final IdTypeRepository tipoIdentificacionRepository;

    public IdTypeDoesExistsRuleImpl(final IdTypeRepository tipoIdentificacionRepository) {
        this.tipoIdentificacionRepository = tipoIdentificacionRepository;
    }

    @Override
    public void validate(final UUID data) {
        if (!tipoIdentificacionRepository.existsById(data)) {
            throw IdTypeDoesNotExistsException.create();
        }
    }
}
