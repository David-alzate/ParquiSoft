package co.parquisoft.domain.parkings.branch.rules.impl;

import co.parquisoft.application.secondaryports.repository.parkings.BranchRepository;
import co.parquisoft.domain.parkings.branch.exception.BranchDoesNotExistsException;
import co.parquisoft.domain.parkings.branch.rules.BranchDoesExistsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BranchDoesExistsRuleImpl implements BranchDoesExistsRule {

    private final BranchRepository branchRepository;

    public BranchDoesExistsRuleImpl(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    @Override
    public void validate(UUID data) {
        if (!branchRepository.existsById(data)) {
            throw BranchDoesNotExistsException.create();
        }
    }
}
