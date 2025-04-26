package co.parquisoft.domain.commons.status.rules.impl;

import co.parquisoft.application.secondaryports.repository.commons.StatusRepository;
import co.parquisoft.domain.commons.status.exception.StatusDoesExistsException;
import co.parquisoft.domain.commons.status.rules.StatusDoesNotExistsRule;

import java.util.UUID;

public class StatusDoesNotExistsRuleImpl implements StatusDoesNotExistsRule {

    private final StatusRepository statusRepository;

    public StatusDoesNotExistsRuleImpl(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    @Override
    public void validate(UUID data) {
        if (statusRepository.existsById(data)) {
            throw StatusDoesExistsException.create();
        }
    }
}
