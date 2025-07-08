package co.parquisoft.domain.parkings.branch.rules.impl;

import co.parquisoft.application.secondaryports.repository.parkings.BranchRepository;
import co.parquisoft.domain.parkings.branch.exception.BranchDoesExistsException;
import co.parquisoft.domain.parkings.branch.rules.BranchDoesNotExistsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BranchDoesNotExistsRuleImpl implements BranchDoesNotExistsRule {

    private final BranchRepository branchRepository;

    public BranchDoesNotExistsRuleImpl(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    @Override
    public void validate(UUID data) {
        if (branchRepository.existsById(data)) {
            throw BranchDoesExistsException.create();
        }
    }
}
