package co.parquisoft.application.usecase.parkings.state;

import co.parquisoft.application.usecase.UseCaseWithoutInput;
import co.parquisoft.domain.parkings.state.StateDomain;

import java.util.List;

public interface GetStates extends UseCaseWithoutInput<List<StateDomain>> {
}
