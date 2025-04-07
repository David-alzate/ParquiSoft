package co.parquisoft.application.usecase.commons.vehicletype;

import java.util.List;

import co.parquisoft.application.usecase.UseCaseWithReturn;
import co.parquisoft.domain.commons.tipovehiculo.VehicleTypeDomain;

public interface GetVehicleType extends UseCaseWithReturn<VehicleTypeDomain, List<VehicleTypeDomain>>{

}
