package co.parquisoft.application.secondaryports.entity.parkings;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "city")
public class CityEntity {

    @Id
    @Column(name = "id")
    private UUID id;
    private String name;
    private String zipCode;

    @ManyToOne
    @JoinColumn(name = "id_state")
    private StateEntity state;

    public CityEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
        setZipCode(TextHelper.EMPTY);
        setState(StateEntity.create());
    }

    public CityEntity(UUID id, String name, String zipCode, StateEntity state) {
        setId(id);
        setName(name);
        setZipCode(zipCode);
        setState(state);
    }

    public static CityEntity create(UUID id, String name, String zipCode, StateEntity state) {
        return new CityEntity(id, name, zipCode, state);
    }

    public static CityEntity create(UUID id) {
        return new CityEntity(id, TextHelper.EMPTY, TextHelper.EMPTY, StateEntity.create());
    }

    public static CityEntity create() {
        return new CityEntity(UUIDHelper.getDefault(), TextHelper.EMPTY, TextHelper.EMPTY, StateEntity.create());
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public StateEntity getState() {
        return state;
    }

    public void setState(StateEntity state) {
        this.state = state;
    }
}
