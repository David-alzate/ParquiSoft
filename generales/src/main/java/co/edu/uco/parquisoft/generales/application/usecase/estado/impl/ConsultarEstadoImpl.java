package co.edu.uco.parquisoft.generales.application.usecase.estado.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.uco.parquisoft.generales.application.secondaryports.mapper.EstadoEntityMapper;
import co.edu.uco.parquisoft.generales.application.secondaryports.repository.EstadoRepository;
import co.edu.uco.parquisoft.generales.application.usecase.estado.ConsultarEstado;
import co.edu.uco.parquisoft.generales.domain.estado.EstadoDomain;

@Service
public class ConsultarEstadoImpl implements ConsultarEstado {

	private EstadoRepository estadoRepository;

	public ConsultarEstadoImpl(EstadoRepository estadoRepository) {
		this.estadoRepository = estadoRepository;
	}

	@Override
	public List<EstadoDomain> execute(EstadoDomain domain) {
		var estadoEntity = EstadoEntityMapper.INSTANCE.toEntity(domain);
		var resultadosEntity = estadoRepository.findByFilter(estadoEntity);
		return EstadoEntityMapper.INSTANCE.toDomainCollection(resultadosEntity);
	}

}
