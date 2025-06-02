package co.parquisoft.application.primaryports.dto.parkings;

import co.parquisoft.crosscutting.helpers.ObjectHelper;
import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class CityDTO {

    private UUID id;
    private String name;
    private String zipCode;
    private StateDTO state;

    public CityDTO() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
        setZipCode(TextHelper.EMPTY);
        setState(StateDTO.create());
    }

    public CityDTO(UUID id, String name, String zipCode, StateDTO state) {
        setId(id);
        setName(name);
        setZipCode(zipCode);
        setState(state);
    }

    public static CityDTO create(UUID id, String name, String zipCode, StateDTO state) {
        return new CityDTO(id, name, zipCode, state);
    }

    public static CityDTO create() {
        return new CityDTO();
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = TextHelper.applyTrim(zipCode);
    }

    public StateDTO getState() {
        return state;
    }

    public void setState(StateDTO state) {
        this.state = ObjectHelper.getDefault(state, StateDTO.create());
    }
}
