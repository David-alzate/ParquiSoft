package co.parquisoft.application.usecase.parkings.branch;

import co.parquisoft.application.usecase.UseCaseWithoutInput;
import co.parquisoft.domain.parkings.branch.BranchDomain;

import java.util.List;

public interface GetBranchs extends UseCaseWithoutInput<List<BranchDomain>> {
}
