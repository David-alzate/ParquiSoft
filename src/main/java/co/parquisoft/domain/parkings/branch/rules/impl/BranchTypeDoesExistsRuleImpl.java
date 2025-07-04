package co.parquisoft.domain.parkings.branch.rules.impl;

import co.parquisoft.application.secondaryports.repository.parkings.BranchTypeRepository;
import co.parquisoft.domain.parkings.branch.exception.BranchTypeDoesNotExistsException;
import co.parquisoft.domain.parkings.branch.rules.BranchTypeDoesExistsRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BranchTypeDoesExistsRuleImpl implements BranchTypeDoesExistsRule {

    private final BranchTypeRepository branchTypeRepository;

    public BranchTypeDoesExistsRuleImpl(BranchTypeRepository branchTypeRepository) {
        this.branchTypeRepository = branchTypeRepository;
    }

    @Override
    public void validate(UUID data) {
        if (!branchTypeRepository.existsById(data)) {
            throw BranchTypeDoesNotExistsException.create();
        }
    }
}
