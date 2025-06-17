package co.parquisoft.domain.parkings.country.rules.impl;

import co.parquisoft.application.secondaryports.repository.parkings.CountryRepository;
import co.parquisoft.domain.parkings.country.exception.CountryDoesNotExistsException;
import co.parquisoft.domain.parkings.country.rules.CountryDoesExistsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CountryDoesExistsRuleImpl implements CountryDoesExistsRule {

    private final CountryRepository countryRepository;

    public CountryDoesExistsRuleImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public void validate(UUID data) {
        if (!countryRepository.existsById(data)) {
            throw CountryDoesNotExistsException.create();
        }
    }
}
