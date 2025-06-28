package co.parquisoft.application.secondaryports.entity.parkings;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "parking")
public class ParkingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;

    public ParkingEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public ParkingEntity(UUID id, String name) {
        setId(id);
        setName(name);
    }

    public static ParkingEntity create(UUID id, String name) {
        return new ParkingEntity(id, name);
    }

    public static ParkingEntity create(UUID id) {
        return new ParkingEntity(id, TextHelper.EMPTY);
    }

    public static ParkingEntity create() {
        return new ParkingEntity();
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
