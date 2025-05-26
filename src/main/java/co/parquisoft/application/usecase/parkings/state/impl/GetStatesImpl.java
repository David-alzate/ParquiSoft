package co.parquisoft.application.usecase.parkings.state.impl;

import co.parquisoft.application.secondaryports.entity.parkings.StateEntity;
import co.parquisoft.application.secondaryports.mapper.parkings.StateEntityMapper;
import co.parquisoft.application.secondaryports.repository.parkings.StateRepository;
import co.parquisoft.application.usecase.parkings.state.GetStates;
import co.parquisoft.domain.parkings.state.StateDomain;

import java.util.List;

public class GetStatesImpl implements GetStates {

    private StateRepository stateRepository;

    public GetStatesImpl(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    @Override
    public List<StateDomain> execute() {
        List<StateEntity> results = stateRepository.findAll();
        return StateEntityMapper.INSTANCE.toDomainCollection(results);
    }
}
