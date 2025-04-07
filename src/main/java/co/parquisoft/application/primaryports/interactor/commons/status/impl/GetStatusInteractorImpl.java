package co.parquisoft.application.primaryports.interactor.commons.status.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.parquisoft.application.primaryports.dto.commons.StatusTO;
import co.parquisoft.application.primaryports.interactor.commons.status.GetStatusInteractor;
import co.parquisoft.application.primaryports.mapper.commons.StatusDTOMapper;
import co.parquisoft.application.usecase.commons.status.GetStatus;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class GetStatusInteractorImpl implements GetStatusInteractor {

	private GetStatus consultarEstado;

	public GetStatusInteractorImpl(GetStatus consultarEstado) {
		this.consultarEstado = consultarEstado;
	}

	@Override
	public List<StatusTO> execute(StatusTO data) {
		var estadoDomain = StatusDTOMapper.INSTANCE.toDomain(data);
		var resultados = consultarEstado.execute(estadoDomain);
		return StatusDTOMapper.INSTANCE.toDtoCollection(resultados);
	}

}
