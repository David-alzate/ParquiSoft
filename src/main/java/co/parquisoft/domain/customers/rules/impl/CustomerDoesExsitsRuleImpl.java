package co.parquisoft.domain.customers.rules.impl;

import co.parquisoft.domain.customers.rules.CustomerDoesExsitsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerDoesExsitsRuleImpl implements CustomerDoesExsitsRule {

    @Override
    public void validate(UUID data) {

    }
}
