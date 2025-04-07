package co.parquisoft.application.primaryports.dto.commons;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public final class StatusTO {

    private UUID id;
    private String name;

    public StatusTO() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public StatusTO(UUID id, String name) {
        setId(id);
        setName(name);
    }

    public static StatusTO create(UUID id, String name) {
        return new StatusTO(id, name);
    }

    public static StatusTO create() {
        return new StatusTO();
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
