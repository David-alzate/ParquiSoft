package co.parquisoft.application.usecase.commons.vehicletype.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.parquisoft.application.secondaryports.mapper.commons.VehicleTypeEntityMapper;
import co.parquisoft.application.secondaryports.repository.commons.VehicleTypeRepository;
import co.parquisoft.application.usecase.commons.vehicletype.GetVehicleType;
import co.parquisoft.domain.commons.tipovehiculo.VehicleTypeDomain;

@Service
public class GetVehicleTypeImpl implements GetVehicleType {

	private final VehicleTypeRepository tipoVehiculoRepository;

	public GetVehicleTypeImpl(VehicleTypeRepository tipoVehiculoRepository) {
		this.tipoVehiculoRepository = tipoVehiculoRepository;
	}

	@Override
	public List<VehicleTypeDomain> execute(VehicleTypeDomain domain) {
		var tipoVehiculoFilter = VehicleTypeEntityMapper.INSTANCE.toEntity(domain);
		var resultados = tipoVehiculoRepository.findByFilter(tipoVehiculoFilter);
		return VehicleTypeEntityMapper.INSTANCE.toDomainCollection(resultados);
	}

}
