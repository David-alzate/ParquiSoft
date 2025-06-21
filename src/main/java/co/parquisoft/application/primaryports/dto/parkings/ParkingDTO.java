package co.parquisoft.application.primaryports.dto.parkings;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class ParkingDTO {

    private UUID id;
    private String name;

    public ParkingDTO() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public ParkingDTO(UUID id, String name) {
        setId(id);
        setName(name);
    }

    public static ParkingDTO create(UUID id, String name) {
        return new ParkingDTO(id, name);
    }

    public static ParkingDTO create() {
        return new ParkingDTO();
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
