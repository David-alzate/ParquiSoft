package co.parquisoft.domain.parkings.branch;

import co.parquisoft.domain.Domain;
import co.parquisoft.domain.parkings.city.CityDomain;
import co.parquisoft.domain.parkings.parking.ParkingDomain;

import java.util.UUID;

public class BranchDomain extends Domain {

    private ParkingDomain parking;
    private String name;
    private CityDomain city;
    private String address;
    private BranchTypeDomain branchType;
    private String email;

    public BranchDomain(UUID id, ParkingDomain parking, String name, CityDomain city, String address, BranchTypeDomain branchType, String email) {
        super(id);
        setParking(parking);
        setName(name);
        setCity(city);
        setAddress(address);
        setBranchType(branchType);
        setEmail(email);
    }

    public ParkingDomain getParking() {
        return parking;
    }

    public void setParking(ParkingDomain parking) {
        this.parking = parking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CityDomain getCity() {
        return city;
    }

    public void setCity(CityDomain city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BranchTypeDomain getBranchType() {
        return branchType;
    }

    public void setBranchType(BranchTypeDomain branchType) {
        this.branchType = branchType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
