package co.parquisoft.application.usecase.commons.idtype.impl;

import co.parquisoft.application.secondaryports.entity.commons.IdTypeEntity;
import co.parquisoft.application.secondaryports.mapper.commons.IdTypeEntityMapper;
import co.parquisoft.application.secondaryports.repository.commons.IdTypeRepository;
import co.parquisoft.application.usecase.commons.idtype.GetIdType;
import co.parquisoft.domain.commons.idtype.IdTypeDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetIdTypeImpl implements GetIdType {

    private final IdTypeRepository tipoIdentificacionRepository;

    public GetIdTypeImpl(IdTypeRepository tipoIdentificacionRepository) {
        this.tipoIdentificacionRepository = tipoIdentificacionRepository;
    }

    @Override
    public List<IdTypeDomain> execute() {
        List<IdTypeEntity> resultsEntity = tipoIdentificacionRepository.findAll();
        return IdTypeEntityMapper.INSTANCE.toDomainCollection(resultsEntity);
    }
}
