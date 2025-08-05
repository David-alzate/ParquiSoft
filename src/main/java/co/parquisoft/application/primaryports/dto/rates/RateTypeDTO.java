package co.parquisoft.application.primaryports.dto.rates;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class RateTypeDTO {

    private UUID id;
    private String name;

    public RateTypeDTO() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public RateTypeDTO(UUID id, String name) {
        setId(id);
        setName(name);
    }

    public static RateTypeDTO create(UUID id, String name) {
        return new RateTypeDTO(id, name);
    }

    public static RateTypeDTO create() {
        return new RateTypeDTO();
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
