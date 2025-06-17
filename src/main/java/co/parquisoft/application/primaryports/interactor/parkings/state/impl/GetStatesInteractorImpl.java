package co.parquisoft.application.primaryports.interactor.parkings.state.impl;

import co.parquisoft.application.primaryports.dto.parkings.StateDTO;
import co.parquisoft.application.primaryports.interactor.parkings.state.GetStatesInteractor;
import co.parquisoft.application.primaryports.mapper.parkings.StateDTOMapper;
import co.parquisoft.application.usecase.parkings.state.GetStates;
import co.parquisoft.domain.parkings.state.StateDomain;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GetStatesInteractorImpl implements GetStatesInteractor {

    private final GetStates getStates;

    public GetStatesInteractorImpl(GetStates getStates) {
        this.getStates = getStates;
    }

    @Override
    public List<StateDTO> execute() {
        List<StateDomain> results = getStates.execute();
        return StateDTOMapper.INSTANCE.toDtoCollection(results);
    }
}
