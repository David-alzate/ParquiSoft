package co.parquisoft.domain.commons.status.rules.impl;

import co.parquisoft.application.secondaryports.repository.commons.StatusRepository;
import co.parquisoft.domain.commons.status.exception.StatusDoesNotExistsException;
import co.parquisoft.domain.commons.status.rules.StatusDoesExistsRule;

import java.util.UUID;

public class StatusDoesExistsRuleImpl implements StatusDoesExistsRule {

    private final StatusRepository statusRepository;

    public StatusDoesExistsRuleImpl(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @Override
    public void validate(UUID data) {
        if (!statusRepository.existsById(data)) {
            throw StatusDoesNotExistsException.create();
        }

    }
}
