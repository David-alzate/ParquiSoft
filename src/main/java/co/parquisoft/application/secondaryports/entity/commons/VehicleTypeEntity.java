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

    public static IdTypeEntity create() {
        return new IdTypeEntity();
    }

    public static IdTypeEntity create(UUID id) {
        return new IdTypeEntity(id, TextHelper.EMPTY);
    }

    public static IdTypeEntity create(UUID id, String name) {
        return new IdTypeEntity(id, name);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
