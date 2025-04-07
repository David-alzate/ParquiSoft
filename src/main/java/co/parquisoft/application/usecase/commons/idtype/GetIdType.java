package co.parquisoft.application.usecase.commons.idtype;

import co.parquisoft.application.usecase.UseCaseWithReturn;
import co.parquisoft.domain.commons.idtype.IdTypeDomain;

import java.util.List;

public interface GetIdType extends UseCaseWithReturn<IdTypeDomain, List<IdTypeDomain>> {
}
