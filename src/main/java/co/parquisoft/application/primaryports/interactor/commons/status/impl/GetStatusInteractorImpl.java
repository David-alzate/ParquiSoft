package co.parquisoft.application.primaryports.interactor.commons.status.impl;

import co.parquisoft.application.primaryports.dto.commons.StatusDTO;
import co.parquisoft.application.primaryports.interactor.commons.status.GetStatusInteractor;
import co.parquisoft.application.primaryports.mapper.commons.StatusDTOMapper;
import co.parquisoft.application.usecase.commons.status.GetStatus;
import co.parquisoft.domain.commons.status.StatusDomain;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GetStatusInteractorImpl implements GetStatusInteractor {

    private final GetStatus consultarEstado;

    public GetStatusInteractorImpl(GetStatus consultarEstado) {
        this.consultarEstado = consultarEstado;
    }

    @Override
    public List<StatusDTO> execute() {
        List<StatusDomain> results = consultarEstado.execute();
        return StatusDTOMapper.INSTANCE.toDtoCollection(results);
    }

}
