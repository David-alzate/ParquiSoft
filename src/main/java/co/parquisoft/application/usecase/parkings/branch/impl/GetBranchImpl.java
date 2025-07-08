package co.parquisoft.application.usecase.parkings.branch.impl;

import co.parquisoft.application.secondaryports.entity.parkings.BranchEntity;
import co.parquisoft.application.secondaryports.mapper.parkings.BranchEntityMapper;
import co.parquisoft.application.secondaryports.repository.parkings.BranchRepository;
import co.parquisoft.application.usecase.parkings.branch.GetBranchs;
import co.parquisoft.domain.parkings.branch.BranchDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetBranchImpl implements GetBranchs {

    private final BranchRepository branchRepository;

    public GetBranchImpl(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    @Override
    public List<BranchDomain> execute() {
        List<BranchEntity> results = branchRepository.findAll();
        return BranchEntityMapper.INSTANCE.toDomainCollection(results);
    }
}
