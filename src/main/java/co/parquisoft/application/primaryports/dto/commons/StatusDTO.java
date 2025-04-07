package co.parquisoft.application.primaryports.dto.commons;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public final class StatusDTO {

    private UUID id;
    private String name;

    public StatusDTO() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public StatusDTO(UUID id, String name) {
        setId(id);
        setName(name);
    }

    public static StatusDTO create(UUID id, String name) {
        return new StatusDTO(id, name);
    }

    public static StatusDTO create() {
        return new StatusDTO();
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
