package co.parquisoft.application.primaryports.interactor.parkings.branch.impl;

import co.parquisoft.application.primaryports.dto.parkings.BranchTypeDTO;
import co.parquisoft.application.primaryports.interactor.parkings.branch.GetBranchTypeInteractor;
import co.parquisoft.application.primaryports.mapper.parkings.BranchTypeDTOMapper;
import co.parquisoft.application.usecase.parkings.branch.GetBranchType;
import co.parquisoft.domain.parkings.branch.BranchTypeDomain;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GetBranchTypeInteractorImpl implements GetBranchTypeInteractor {

    private final GetBranchType getBranchType;

    public GetBranchTypeInteractorImpl(GetBranchType getBranchType) {
        this.getBranchType = getBranchType;
    }

    @Override
    public List<BranchTypeDTO> execute() {
        List<BranchTypeDomain> results = getBranchType.execute();
        return BranchTypeDTOMapper.INSTANCE.toDtoCollection(results);
    }
}
