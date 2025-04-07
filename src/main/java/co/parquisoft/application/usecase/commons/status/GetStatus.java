package co.parquisoft.application.usecase.commons.status;

import java.util.List;

import co.parquisoft.application.usecase.UseCaseWithReturn;
import co.parquisoft.domain.commons.status.StatusDomain;

public interface GetStatus extends UseCaseWithReturn<StatusDomain, List<StatusDomain>>{

}
