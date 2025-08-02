package co.parquisoft.domain.customers.rules.impl;

import co.parquisoft.application.secondaryports.repository.customers.CustomerRepository;
import co.parquisoft.domain.customers.exceptions.CustomerDoesNotExsitsException;
import co.parquisoft.domain.customers.rules.CustomerDoesExsitsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerDoesExsitsRuleImpl implements CustomerDoesExsitsRule {

    private final CustomerRepository customerRepository;

    public CustomerDoesExsitsRuleImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void validate(UUID data) {
        if (!customerRepository.existsById(data)) {
            throw CustomerDoesNotExsitsException.create();
        }
    }
}
