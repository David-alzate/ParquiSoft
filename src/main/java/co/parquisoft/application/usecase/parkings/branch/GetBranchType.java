package co.parquisoft.application.usecase.parkings.branch;

import co.parquisoft.application.usecase.UseCaseWithoutInput;
import co.parquisoft.domain.parkings.branch.BranchTypeDomain;

import java.util.List;

public interface GetBranchType extends UseCaseWithoutInput<List<BranchTypeDomain>> {
}
