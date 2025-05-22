package co.parquisoft.application.secondaryports.entity.commons;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "vehicle_type")
public final class VehicleTypeEntity {

    @Id
    @Column(name = "id")
    private UUID id;
    private String name;

    public VehicleTypeEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public VehicleTypeEntity(UUID id, String name) {
        setId(id);
        setName(name);
    }

    public static VehicleTypeEntity create() {
        return new VehicleTypeEntity();
    }

    public static VehicleTypeEntity create(UUID id) {
        return new VehicleTypeEntity(id, TextHelper.EMPTY);
    }

    public static VehicleTypeEntity create(UUID id, String name) {
        return new VehicleTypeEntity(id, name);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = TextHelper.applyTrim(name);
    }

}
