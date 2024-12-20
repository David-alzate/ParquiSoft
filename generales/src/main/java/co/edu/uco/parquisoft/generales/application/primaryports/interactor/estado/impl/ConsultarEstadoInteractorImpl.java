package co.edu.uco.parquisoft.generales.application.primaryports.interactor.estado.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.uco.parquisoft.generales.application.primaryports.dto.EstadoDTO;
import co.edu.uco.parquisoft.generales.application.primaryports.interactor.estado.ConsultarEstadoInteractor;
import co.edu.uco.parquisoft.generales.application.primaryports.mapper.EstadoDTOMapper;
import co.edu.uco.parquisoft.generales.application.usecase.estado.ConsultarEstado;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ConsultarEstadoInteractorImpl implements ConsultarEstadoInteractor {

	private ConsultarEstado consultarEstado;

	public ConsultarEstadoInteractorImpl(ConsultarEstado consultarEstado) {
		this.consultarEstado = consultarEstado;
	}

	@Override
	public List<EstadoDTO> execute(EstadoDTO data) {
		var estadoDomain = EstadoDTOMapper.INSTANCE.toDomain(data);
		var resultados = consultarEstado.execute(estadoDomain);
		return EstadoDTOMapper.INSTANCE.toDtoCollection(resultados);
	}

}
