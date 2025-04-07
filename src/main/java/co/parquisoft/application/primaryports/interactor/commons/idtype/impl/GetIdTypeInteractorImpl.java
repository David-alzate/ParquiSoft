package co.parquisoft.application.primaryports.interactor.commons.idtype.impl;

import co.parquisoft.application.primaryports.dto.commons.IdTypeDTO;
import co.parquisoft.application.primaryports.interactor.commons.idtype.GetIdTypeInteractor;
import co.parquisoft.application.primaryports.mapper.commons.IdTypeDTOMapper;
import co.parquisoft.application.usecase.commons.idtype.GetIdType;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GetIdTypeInteractorImpl implements GetIdTypeInteractor {

    private GetIdType consultarTipoIdentificacion;

    public GetIdTypeInteractorImpl(GetIdType consultarTipoIdentificacion) {
        this.consultarTipoIdentificacion = consultarTipoIdentificacion;
    }

    @Override
    public List<IdTypeDTO> execute(IdTypeDTO data) {

        var tipoidentificaciondomain = IdTypeDTOMapper.INSTANCE.toDomain(data);
        var resultados = consultarTipoIdentificacion.execute(tipoidentificaciondomain);
        return IdTypeDTOMapper.INSTANCE.toDtoCollection(resultados);
    }
}
