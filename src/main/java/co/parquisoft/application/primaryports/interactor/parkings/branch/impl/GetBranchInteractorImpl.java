package co.parquisoft.application.primaryports.interactor.parkings.branch.impl;

import co.parquisoft.application.primaryports.dto.parkings.BranchDTO;
import co.parquisoft.application.primaryports.interactor.parkings.branch.GetBranchsInteractor;
import co.parquisoft.application.primaryports.mapper.parkings.BranchDTOMapper;
import co.parquisoft.application.usecase.parkings.branch.GetBranchs;
import co.parquisoft.domain.parkings.branch.BranchDomain;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GetBranchInteractorImpl implements GetBranchsInteractor {

    private final GetBranchs getBranch;

    public GetBranchInteractorImpl(GetBranchs getBranch) {
        this.getBranch = getBranch;
    }

    @Override
    public List<BranchDTO> execute() {
        List<BranchDomain> results = getBranch.execute();
        return BranchDTOMapper.INSTANCE.toDtoCollection(results);
    }
}
