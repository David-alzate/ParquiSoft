package co.parquisoft.domain.rates.rules.impl;

import co.parquisoft.application.secondaryports.repository.rate.RateTypeRepository;
import co.parquisoft.domain.rates.exceptions.RateTypeDoesExitsException;
import co.parquisoft.domain.rates.rules.RateTypeDoesNotExtsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RateTypeDoesNotExistsRuleImpl implements RateTypeDoesNotExtsRule {

    private final RateTypeRepository rateTypeRepository;

    public RateTypeDoesNotExistsRuleImpl(RateTypeRepository rateTypeRepository) {
        this.rateTypeRepository = rateTypeRepository;
    }

    @Override
    public void validate(UUID data) {
        if (rateTypeRepository.existsById(data)) {
            throw RateTypeDoesExitsException.create();
        }
    }
}
