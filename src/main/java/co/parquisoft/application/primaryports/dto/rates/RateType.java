package co.parquisoft.application.primaryports.dto.rates;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class RateType {

    private UUID id;
    private String name;

    public RateType() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public RateType(UUID id, String name) {
        setId(id);
        setName(name);
    }

    public static RateType create(UUID id, String name) {
        return new RateType(id, name);
    }

    public static RateType create() {
        return new RateType();
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
