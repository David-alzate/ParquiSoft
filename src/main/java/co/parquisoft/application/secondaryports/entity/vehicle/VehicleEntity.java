package co.parquisoft.application.secondaryports.entity.vehicle;

import co.parquisoft.application.secondaryports.entity.commons.VehicleTypeEntity;
import co.parquisoft.crosscutting.helpers.ObjectHelper;
import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "vehicle")
public class VehicleEntity {

    @Id
    @Column(name = "id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_vehicle_type")
    private VehicleTypeEntity vehicleType;
    private String plate;

    public VehicleEntity() {
        setId(UUIDHelper.getDefault());
        setVehicleType(VehicleTypeEntity.create());
        setPlate(TextHelper.EMPTY);
    }

    public VehicleEntity(UUID id, VehicleTypeEntity vehicleType, String plate) {
        setId(id);
        setVehicleType(vehicleType);
        setPlate(plate);
    }

    public static VehicleEntity create(UUID id, VehicleTypeEntity vehicleType, String plate) {
        return new VehicleEntity(id, vehicleType, plate);
    }

    public static VehicleEntity create(UUID id) {
        return new VehicleEntity(id, VehicleTypeEntity.create(), TextHelper.EMPTY);
    }

    public static VehicleEntity create() {
        return new VehicleEntity();
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

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = TextHelper.applyTrim(plate);
    }
}
