package co.parquisoft.application.usecase.commons.vehicletype.impl;

import co.parquisoft.application.secondaryports.entity.commons.VehicleTypeEntity;
import co.parquisoft.application.secondaryports.mapper.commons.VehicleTypeEntityMapper;
import co.parquisoft.application.secondaryports.repository.commons.VehicleTypeRepository;
import co.parquisoft.application.usecase.commons.vehicletype.GetVehicleType;
import co.parquisoft.domain.commons.vehicletype.VehicleTypeDomain;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetVehicleTypeImpl implements GetVehicleType {

    private final VehicleTypeRepository tipoVehiculoRepository;

    public GetVehicleTypeImpl(VehicleTypeRepository tipoVehiculoRepository) {
        this.tipoVehiculoRepository = tipoVehiculoRepository;
    }

    @Override
    public List<VehicleTypeDomain> execute() {
        List<VehicleTypeEntity> resultados = tipoVehiculoRepository.findAll();
        return VehicleTypeEntityMapper.INSTANCE.toDomainCollection(resultados);
    }

}
