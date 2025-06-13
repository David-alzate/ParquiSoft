package co.parquisoft.domain.parkings.city;

import co.parquisoft.domain.Domain;
import co.parquisoft.domain.parkings.state.StateDomain;

import java.util.UUID;

public class CityDomain extends Domain {

    private String name;
    private String zipCode;
    private StateDomain state;

    public CityDomain(UUID id, String name, String zipCode, StateDomain state) {
        super(id);
        setName(name);
        setZipCode(zipCode);
        setState(state);
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

    public StateDomain getState() {
        return state;
    }

    public void setState(StateDomain state) {
        this.state = state;
    }
}
