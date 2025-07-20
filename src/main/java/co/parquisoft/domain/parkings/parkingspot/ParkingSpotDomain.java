package co.parquisoft.domain.parkings.parkingspot;

import co.parquisoft.domain.Domain;
import co.parquisoft.domain.commons.vehicletype.VehicleTypeDomain;
import co.parquisoft.domain.parkings.branch.BranchDomain;

import java.util.UUID;

public class ParkingSpotDomain extends Domain {

    private VehicleTypeDomain vehicleType;
    private BranchDomain branch;
    private int availableSpots;

    public ParkingSpotDomain(UUID id, VehicleTypeDomain vehicleType, BranchDomain branch, int availableSpots) {
        super(id);
        setVehicleType(vehicleType);
        setBranch(branch);
        setAvailableSpots(availableSpots);
    }

    public VehicleTypeDomain getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleTypeDomain vehicleType) {
        this.vehicleType = vehicleType;
    }

    public BranchDomain getBranch() {
        return branch;
    }

    public void setBranch(BranchDomain branch) {
        this.branch = branch;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots(int availableSpots) {
        this.availableSpots = availableSpots;
    }
}
