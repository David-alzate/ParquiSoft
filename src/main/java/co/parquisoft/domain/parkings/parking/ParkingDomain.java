package co.parquisoft.domain.parkings.parking;

import co.parquisoft.domain.Domain;

import java.util.UUID;

public class ParkingDomain extends Domain {

    private String name;

    public ParkingDomain(UUID id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
