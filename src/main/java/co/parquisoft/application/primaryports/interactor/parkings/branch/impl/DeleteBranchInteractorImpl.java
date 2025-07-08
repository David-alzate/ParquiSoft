package co.parquisoft.application.primaryports.interactor.parkings.branch.impl;

import co.parquisoft.application.primaryports.interactor.parkings.branch.DeleteBranchInteractor;
import co.parquisoft.application.usecase.parkings.branch.DeleteBranch;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class DeleteBranchInteractorImpl implements DeleteBranchInteractor {

    private final DeleteBranch deleteBranch;

    public DeleteBranchInteractorImpl(DeleteBranch deleteBranch) {
        this.deleteBranch = deleteBranch;
    }

    @Override
    public void execute(UUID data) {
        deleteBranch.execute(data);
    }
}
