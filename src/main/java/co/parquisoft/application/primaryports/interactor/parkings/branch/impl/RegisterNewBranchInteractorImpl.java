package co.parquisoft.application.primaryports.interactor.parkings.branch.impl;

import co.parquisoft.application.primaryports.dto.parkings.BranchDTO;
import co.parquisoft.application.primaryports.interactor.parkings.branch.RegisterNewBranchInteractor;
import co.parquisoft.application.primaryports.mapper.parkings.BranchDTOMapper;
import co.parquisoft.application.usecase.parkings.branch.RegisterNewBranch;
import co.parquisoft.domain.parkings.branch.BranchDomain;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RegisterNewBranchInteractorImpl implements RegisterNewBranchInteractor {

    private final RegisterNewBranch registerNewBranch;

    public RegisterNewBranchInteractorImpl(RegisterNewBranch registerNewBranch) {
        this.registerNewBranch = registerNewBranch;
    }

    @Override
    public void execute(BranchDTO data) {
        BranchDomain branchDomain = BranchDTOMapper.INSTANCE.toDomain(data);
        registerNewBranch.execute(branchDomain);
    }
}
