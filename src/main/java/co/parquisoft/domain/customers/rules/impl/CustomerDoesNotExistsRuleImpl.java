package co.parquisoft.domain.customers.rules.impl;

import co.parquisoft.application.secondaryports.repository.customers.CustomerRepository;
import co.parquisoft.domain.customers.exceptions.CustomerDoesExistsException;
import co.parquisoft.domain.customers.rules.CustomerDoesNotExistsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerDoesNotExistsRuleImpl implements CustomerDoesNotExistsRule {

    private final CustomerRepository customerRepository;

    public CustomerDoesNotExistsRuleImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void validate(UUID data) {
        if (customerRepository.existsById(data)) {
            throw CustomerDoesExistsException.create();
        }
    }
}
