package co.parquisoft.domain.parkings.state;

import co.parquisoft.domain.Domain;
import co.parquisoft.domain.parkings.country.CountryDomain;

import java.util.UUID;

public class StateDomain extends Domain {

    private String name;
    private CountryDomain country;

    public StateDomain(UUID id, String name, CountryDomain country) {
        super(id);
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CountryDomain getCountry() {
        return country;
    }

    public void setCountry(CountryDomain country) {
        this.country = country;
    }
}
