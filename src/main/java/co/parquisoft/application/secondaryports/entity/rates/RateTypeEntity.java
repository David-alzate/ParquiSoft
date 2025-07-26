package co.parquisoft.application.secondaryports.entity.rates;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "rate_type")
public class RateTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;

    public RateTypeEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public RateTypeEntity(UUID id, String name) {
        setId(id);
        setName(name);
    }

    public static RateTypeEntity create(UUID id, String name) {
        return new RateTypeEntity(id, name);
    }

    public static RateTypeEntity create(UUID id) {
        return new RateTypeEntity(id, TextHelper.EMPTY);
    }

    public static RateTypeEntity create() {
        return new RateTypeEntity(UUIDHelper.getDefault(), TextHelper.EMPTY);
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
