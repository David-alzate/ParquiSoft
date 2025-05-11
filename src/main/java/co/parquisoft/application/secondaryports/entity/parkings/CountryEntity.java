package co.parquisoft.application.secondaryports.entity.parkings;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "country")
public class CountryEntity {

    @Id
    @Column(name = "id")
    private UUID id;
    private String name;

    public CountryEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public CountryEntity(UUID id, String name) {
        setId(id);
        setName(name);
    }

    public static CountryEntity create(UUID id, String name) {
        return new CountryEntity(id, name);
    }

    public static CountryEntity create(UUID id) {
        return new CountryEntity(id, TextHelper.EMPTY);
    }

    public static CountryEntity create() {
        return new CountryEntity();
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
