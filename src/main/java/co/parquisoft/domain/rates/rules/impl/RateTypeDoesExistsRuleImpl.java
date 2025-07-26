package co.parquisoft.domain.rates.rules.impl;

import co.parquisoft.application.secondaryports.repository.rate.RateTypeRepository;
import co.parquisoft.domain.rates.exceptions.RateTypeDoesNotExitsException;
import co.parquisoft.domain.rates.rules.RateTypeDoesExitsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RateTypeDoesExistsRuleImpl implements RateTypeDoesExitsRule {

    private final RateTypeRepository rateTypeRepository;

    public RateTypeDoesExistsRuleImpl(RateTypeRepository rateTypeRepository) {
        this.rateTypeRepository = rateTypeRepository;
    }

    @Override
    public void validate(UUID data) {
        if (!rateTypeRepository.existsById(data)) {
            throw RateTypeDoesNotExitsException.create();
        }
    }
}
