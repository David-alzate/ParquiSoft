package co.parquisoft.application.primaryports.dto.parkings;

import co.parquisoft.crosscutting.helpers.ObjectHelper;
import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class BranchDTO {

    private UUID id;
    private ParkingDTO parking;
    private String name;
    private CityDTO city;
    private String address;
    private BranchTypeDTO branchType;
    private String email;

    public BranchDTO() {
        setId(UUIDHelper.getDefault());
        setParking(ParkingDTO.create());
        setName(TextHelper.EMPTY);
        setCity(CityDTO.create());
        setAddress(TextHelper.EMPTY);
        setBranchType(BranchTypeDTO.create());
        setEmail(TextHelper.EMPTY);
    }

    public BranchDTO(UUID id, ParkingDTO parking, String name, CityDTO city, String address, BranchTypeDTO branchType, String email) {
        setId(id);
        setParking(parking);
        setName(name);
        setCity(city);
        setAddress(address);
        setBranchType(branchType);
        setEmail(email);
    }

    public static BranchDTO create(UUID id, ParkingDTO parking, String name, CityDTO city, String address, BranchTypeDTO branchType, String email) {
        return new BranchDTO(id, parking, name, city, address, branchType, email);
    }

    public static BranchDTO create() {
        return new BranchDTO();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    public ParkingDTO getParking() {
        return parking;
    }

    public void setParking(ParkingDTO parking) {
        this.parking = ObjectHelper.getDefault(parking, ParkingDTO.create());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = TextHelper.applyTrim(name);
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = ObjectHelper.getDefault(city, CityDTO.create());
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = TextHelper.applyTrim(address);
    }

    public BranchTypeDTO getBranchType() {
        return branchType;
    }

    public void setBranchType(BranchTypeDTO branchType) {
        this.branchType = ObjectHelper.getDefault(branchType, BranchTypeDTO.create());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = TextHelper.applyTrim(email);
    }
}
