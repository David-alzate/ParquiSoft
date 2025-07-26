package co.parquisoft.domain.rates;

import co.parquisoft.domain.Domain;

import java.util.UUID;

public class RateTypeDomain extends Domain {

    private String name;

    public RateTypeDomain(UUID id, String name) {
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
