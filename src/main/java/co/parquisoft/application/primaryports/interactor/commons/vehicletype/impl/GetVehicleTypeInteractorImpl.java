package co.parquisoft.application.primaryports.interactor.commons.vehicletype.impl;

import co.parquisoft.application.primaryports.dto.commons.VehicleTypeDTO;
import co.parquisoft.application.primaryports.interactor.commons.vehicletype.GetVehicleTypeInteractor;
import co.parquisoft.application.primaryports.mapper.commons.VehicleTypeDTOMapper;
import co.parquisoft.application.usecase.commons.vehicletype.GetVehicleType;
import co.parquisoft.domain.commons.tipovehiculo.VehicleTypeDomain;

import java.util.List;

public class GetVehicleTypeInteractorImpl implements GetVehicleTypeInteractor {

    private final GetVehicleType getVehicleType;

    public GetVehicleTypeInteractorImpl(GetVehicleType getVehicleType) {
        this.getVehicleType = getVehicleType;
    }

    @Override
    public List<VehicleTypeDTO> execute() {
        List<VehicleTypeDomain> vehicleTypes = getVehicleType.execute();
        return VehicleTypeDTOMapper.INSTANCE.toDtoCollection(vehicleTypes);
    }
}
