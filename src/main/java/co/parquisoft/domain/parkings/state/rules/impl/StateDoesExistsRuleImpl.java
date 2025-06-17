package co.parquisoft.domain.parkings.state.rules.impl;

import co.parquisoft.application.secondaryports.repository.parkings.StateRepository;
import co.parquisoft.domain.parkings.state.exceptions.StateDoesNotExistsException;
import co.parquisoft.domain.parkings.state.rules.StateDoesExistsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StateDoesExistsRuleImpl implements StateDoesExistsRule {

    private final StateRepository stateRepository;

    public StateDoesExistsRuleImpl(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @Override
    public void validate(UUID data) {
        if (!stateRepository.existsById(data)) {
            throw StateDoesNotExistsException.create();
        }

    }
}
