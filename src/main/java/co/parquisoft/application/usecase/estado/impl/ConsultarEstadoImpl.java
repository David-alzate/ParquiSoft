package co.parquisoft.application.usecase.estado.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.parquisoft.application.secondaryports.mapper.EstadoEntityMapper;
import co.parquisoft.application.secondaryports.repository.EstadoRepository;
import co.parquisoft.application.usecase.estado.ConsultarEstado;
import co.parquisoft.domain.estado.EstadoDomain;

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
