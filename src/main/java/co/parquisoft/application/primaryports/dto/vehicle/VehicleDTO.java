package co.parquisoft.application.primaryports.dto.vehicle;

import co.parquisoft.application.primaryports.dto.commons.VehicleTypeDTO;
import co.parquisoft.crosscutting.helpers.ObjectHelper;
import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class VehicleDTO {

    private UUID id;
    private VehicleTypeDTO vehicleType;
    private String plate;

    public VehicleDTO() {
        setId(UUIDHelper.getDefault());
        setVehicleType(VehicleTypeDTO.create());
        setPlate(TextHelper.EMPTY);
    }

    public VehicleDTO(UUID id, VehicleTypeDTO vehicleType, String plate) {
        setId(id);
        setVehicleType(vehicleType);
        setPlate(plate);
    }

    public final VehicleDTO create(UUID id, VehicleTypeDTO vehicleType, String plate) {
        return new VehicleDTO(id, vehicleType, plate);
    }

    public final VehicleDTO create() {
        return new VehicleDTO();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    public VehicleTypeDTO getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleTypeDTO vehicleType) {
        this.vehicleType = ObjectHelper.getDefault(vehicleType, VehicleTypeDTO.create());
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = TextHelper.applyTrim(plate);
    }
}
