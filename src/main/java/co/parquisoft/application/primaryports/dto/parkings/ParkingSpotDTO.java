package co.parquisoft.application.primaryports.dto.parkings;

import co.parquisoft.application.primaryports.dto.commons.VehicleTypeDTO;
import co.parquisoft.crosscutting.helpers.ObjectHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class ParkingSpotDTO {

    private UUID id;
    private VehicleTypeDTO vehicleType;
    private BranchDTO branch;
    private int availableSpots;

    public ParkingSpotDTO() {
        setId(UUIDHelper.getDefault());
        setVehicleType(VehicleTypeDTO.create());
        setBranch(BranchDTO.create());
        setAvailableSpots(0);
    }

    public ParkingSpotDTO(UUID id, VehicleTypeDTO vehicleType, BranchDTO branch, int availableSpots) {
        setId(id);
        setVehicleType(vehicleType);
        setBranch(branch);
        setAvailableSpots(availableSpots);
    }

    public static ParkingSpotDTO create(UUID id, VehicleTypeDTO vehicleType, BranchDTO branch, int availableSpots) {
        return new ParkingSpotDTO(id, vehicleType, branch, availableSpots);
    }

    public static ParkingSpotDTO create() {
        return new ParkingSpotDTO();
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

    public BranchDTO getBranch() {
        return branch;
    }

    public void setBranch(BranchDTO branch) {
        this.branch = ObjectHelper.getDefault(branch, BranchDTO.create());
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots(int availableSpots) {
        this.availableSpots = availableSpots;
    }
}
