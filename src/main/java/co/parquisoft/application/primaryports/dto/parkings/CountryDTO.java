package co.parquisoft.application.primaryports.dto.parkings;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class CountryDTO {

    private UUID id;
    private String name;

    public CountryDTO() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public CountryDTO(UUID id, String name) {
        setId(id);
        setName(name);
    }

    public static CountryDTO create(UUID id, String name) {
        return new CountryDTO(id, name);
    }

    public static CountryDTO create() {
        return new CountryDTO();
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
