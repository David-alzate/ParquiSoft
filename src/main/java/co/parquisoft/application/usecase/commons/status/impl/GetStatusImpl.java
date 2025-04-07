package co.parquisoft.application.usecase.commons.status.impl;

import co.parquisoft.application.secondaryports.mapper.commons.StatusEntityMapper;
import co.parquisoft.application.secondaryports.repository.commons.StatusRepository;
import co.parquisoft.application.usecase.commons.status.GetStatus;
import co.parquisoft.domain.commons.status.StatusDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetStatusImpl implements GetStatus {

    private final StatusRepository estadoRepository;

    public GetStatusImpl(StatusRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    @Override
    public List<StatusDomain> execute(StatusDomain domain) {
        var estadoEntity = StatusEntityMapper.INSTANCE.toEntity(domain);
        var resultadosEntity = estadoRepository.findByFilter(estadoEntity);
        return StatusEntityMapper.INSTANCE.toDomainCollection(resultadosEntity);
    }

}
