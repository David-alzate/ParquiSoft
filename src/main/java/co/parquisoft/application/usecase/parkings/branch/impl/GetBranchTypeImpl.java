package co.parquisoft.application.usecase.parkings.branch.impl;

import co.parquisoft.application.secondaryports.entity.parkings.BranchTypeEntity;
import co.parquisoft.application.secondaryports.mapper.parkings.BranchTypeEntityMapper;
import co.parquisoft.application.secondaryports.repository.parkings.BranchTypeRepository;
import co.parquisoft.application.usecase.parkings.branch.GetBranchType;
import co.parquisoft.domain.parkings.branch.BranchTypeDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetBranchTypeImpl implements GetBranchType {

    private final BranchTypeRepository branchTypeRepository;

    public GetBranchTypeImpl(BranchTypeRepository branchTypeRepository) {
        this.branchTypeRepository = branchTypeRepository;
    }

    @Override
    public List<BranchTypeDomain> execute() {
        List<BranchTypeEntity> results = branchTypeRepository.findAll();
        return BranchTypeEntityMapper.INSTANCE.toDomainCollection(results);
    }
}
