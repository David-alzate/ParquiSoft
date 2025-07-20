package co.parquisoft.application.secondaryports.entity.parkings;

import co.parquisoft.application.secondaryports.entity.commons.VehicleTypeEntity;
import co.parquisoft.crosscutting.helpers.ObjectHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "parking_spot")
public class ParkingSpotEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_vehicle_type")
    private VehicleTypeEntity vehicleType;

    @ManyToOne
    @JoinColumn(name = "id_branch")
    private BranchEntity branch;
    private int availableSpots;

    public ParkingSpotEntity() {
        setId(UUIDHelper.getDefault());
        setVehicleType(VehicleTypeEntity.create());
        setBranch(BranchEntity.create());
        setAvailableSpots(0);
    }

    public ParkingSpotEntity(UUID id, VehicleTypeEntity vehicleType, BranchEntity branch, int availableSpots) {
        setId(id);
        setVehicleType(vehicleType);
        setBranch(branch);
        setAvailableSpots(availableSpots);
    }

    public static ParkingSpotEntity create(UUID id, VehicleTypeEntity vehicleType, BranchEntity branch, int availableSpots) {
        return new ParkingSpotEntity(id, vehicleType, branch, availableSpots);
    }

    public static ParkingSpotEntity create(UUID id) {
        return new ParkingSpotEntity(id, VehicleTypeEntity.create(), BranchEntity.create(), 0);
    }

    public static ParkingSpotEntity create() {
        return new ParkingSpotEntity(UUIDHelper.getDefault(), VehicleTypeEntity.create(), BranchEntity.create(), 0);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    public VehicleTypeEntity getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleTypeEntity vehicleType) {
        this.vehicleType = ObjectHelper.getDefault(vehicleType, VehicleTypeEntity.create());
    }

    public BranchEntity getBranch() {
        return branch;
    }

    public void setBranch(BranchEntity branch) {
        this.branch = ObjectHelper.getDefault(branch, BranchEntity.create());
    }

    public int getAvailableSpots() {
        return availableSpots;
    }

    public void setAvailableSpots(int availableSpots) {
        this.availableSpots = availableSpots;
    }
}
