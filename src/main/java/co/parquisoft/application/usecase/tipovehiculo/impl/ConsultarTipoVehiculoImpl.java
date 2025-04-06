package co.parquisoft.application.usecase.tipovehiculo.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.parquisoft.application.secondaryports.mapper.TipoVehiculoEntityMapper;
import co.parquisoft.application.secondaryports.repository.TipoVehiculoRepository;
import co.parquisoft.application.usecase.tipovehiculo.ConsultarTipoVehiculo;
import co.parquisoft.domain.tipovehiculo.TipoVehiculoDomain;

@Service
public class ConsultarTipoVehiculoImpl implements ConsultarTipoVehiculo {

	private TipoVehiculoRepository tipoVehiculoRepository;

	public ConsultarTipoVehiculoImpl(TipoVehiculoRepository tipoVehiculoRepository) {
		super();
		this.tipoVehiculoRepository = tipoVehiculoRepository;
	}

	@Override
	public List<TipoVehiculoDomain> execute(TipoVehiculoDomain domain) {
		var tipoVehiculoFilter = TipoVehiculoEntityMapper.INSTANCE.toEntity(domain);
		var resultados = tipoVehiculoRepository.findByFilter(tipoVehiculoFilter);
		return TipoVehiculoEntityMapper.INSTANCE.toDomainCollection(resultados);
	}

}
