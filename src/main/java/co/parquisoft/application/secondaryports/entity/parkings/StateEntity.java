package co.parquisoft.application.secondaryports.entity.parkings;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "state")
public class StateEntity {

    @Id
    @Column(name = "id")
    private UUID id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_country")
    private CountryEntity country;

    public StateEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
        setCountry(CountryEntity.create());
    }

    public StateEntity(UUID id, String name, CountryEntity country) {
        setId(id);
        setName(name);
        setCountry(country);
      }

    public static StateEntity create(UUID id, String name, CountryEntity country) {
        return new StateEntity(id, name, country);
    }

    public static StateEntity create(UUID id) {
        return new StateEntity(id, TextHelper.EMPTY, CountryEntity.create());
    }

    public static StateEntity create() {
        return new StateEntity(UUIDHelper.getDefault(), TextHelper.EMPTY, CountryEntity.create());
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

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }
}
