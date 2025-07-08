package co.parquisoft.application.usecase.parkings.branch.impl;

import co.parquisoft.application.secondaryports.entity.parkings.BranchEntity;
import co.parquisoft.application.secondaryports.mapper.parkings.BranchEntityMapper;
import co.parquisoft.application.secondaryports.repository.parkings.BranchRepository;
import co.parquisoft.application.usecase.parkings.branch.RegisterNewBranch;
import co.parquisoft.domain.parkings.branch.BranchDomain;
import org.springframework.stereotype.Service;

@Service
public class RegisterNewBranchImpl implements RegisterNewBranch {

    private final BranchRepository branchRepository;

    public RegisterNewBranchImpl(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    @Override
    public void execute(BranchDomain domain) {
        BranchEntity branchEntity = BranchEntityMapper.INSTANCE.toEntity(domain);
        branchRepository.save(branchEntity);
    }
}
