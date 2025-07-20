package co.parquisoft.application.usecase.parkings.branch.impl;

import co.parquisoft.application.secondaryports.repository.parkings.BranchRepository;
import co.parquisoft.application.usecase.parkings.branch.DeleteBranch;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteBranchImpl implements DeleteBranch {

    private final BranchRepository branchRepository;

    public DeleteBranchImpl(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    @Override
    public void execute(UUID domain) {
        branchRepository.deleteById(domain);
    }
}
