package co.parquisoft.domain.customers.rules.impl;

import co.parquisoft.domain.customers.rules.CustomerDoesNotExistsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerDoesNotExistsRuleImpl implements CustomerDoesNotExistsRule {

    @Override
    public void validate(UUID data) {

    }
}
