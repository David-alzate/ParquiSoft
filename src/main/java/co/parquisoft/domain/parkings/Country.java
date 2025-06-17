package co.parquisoft.domain.parkings;

import co.parquisoft.domain.Domain;

import java.util.UUID;

public class Country extends Domain {

    private String name;

    public Country(UUID id, String name) {
        super(id);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
