package co.parquisoft.domain.vehicle;

import co.parquisoft.domain.Domain;
import co.parquisoft.domain.commons.vehicletype.VehicleTypeDomain;

import java.util.UUID;

public class VehicleDomain extends Domain {

    private VehicleTypeDomain vehicleType;
    private String plate;

    public VehicleDomain(UUID id, VehicleTypeDomain vehicleType, String plate) {
        super(id);
        setVehicleType(vehicleType);
        setPlate(plate);
    }

    public VehicleTypeDomain getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleTypeDomain vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
