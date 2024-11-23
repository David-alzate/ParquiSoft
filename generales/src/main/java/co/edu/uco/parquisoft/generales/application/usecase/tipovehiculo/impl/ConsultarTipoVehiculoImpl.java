package co.edu.uco.parquisoft.generales.application.usecase.tipovehiculo.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.uco.parquisoft.generales.application.secondaryports.mapper.TipoVehiculoEntityMapper;
import co.edu.uco.parquisoft.generales.application.secondaryports.repository.TipoVehiculoRepository;
import co.edu.uco.parquisoft.generales.application.usecase.tipovehiculo.ConsultarTipoVehiculo;
import co.edu.uco.parquisoft.generales.domain.tipovehiculo.TipoVehiculoDomain;

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
