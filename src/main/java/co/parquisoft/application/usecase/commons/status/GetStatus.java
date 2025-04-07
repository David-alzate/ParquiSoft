package co.parquisoft.application.usecase.commons.status;

import co.parquisoft.application.usecase.UseCaseWithoutInput;
import co.parquisoft.domain.commons.status.StatusDomain;

import java.util.List;

public interface GetStatus extends UseCaseWithoutInput<List<StatusDomain>> {

}
