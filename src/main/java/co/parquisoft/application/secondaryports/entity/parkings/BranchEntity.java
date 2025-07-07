package co.parquisoft.application.secondaryports.entity.parkings;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "branch")
public class BranchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_parking")
    private ParkingEntity parking;
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_city")
    private CityEntity city;
    private String address;

    @ManyToOne
    @JoinColumn(name = "id_branch_type")
    private BranchTypeEntity branchType;
    private String email;

    public BranchEntity() {
        setId(UUIDHelper.getDefault());
        setParking(ParkingEntity.create());
        setName(TextHelper.EMPTY);
        setCity(CityEntity.create());
        setAddress(TextHelper.EMPTY);
        setBranchType(BranchTypeEntity.create());
        setEmail(TextHelper.EMPTY);
    }

    public BranchEntity(UUID id, ParkingEntity parking, String name, CityEntity city, String address, BranchTypeEntity branchType, String email) {
        setId(id);
        setParking(parking);
        setName(name);
        setCity(city);
        setAddress(address);
        setBranchType(branchType);
        setEmail(email);
    }

    public static BranchEntity create(UUID id, ParkingEntity parking, String name, CityEntity city, String address, BranchTypeEntity branchType, String email) {
        return new BranchEntity(id, parking, name, city, address, branchType, email);
    }

    public static BranchEntity create(UUID id) {
        return new BranchEntity(id, ParkingEntity.create(), TextHelper.EMPTY, CityEntity.create(), TextHelper.EMPTY, BranchTypeEntity.create(), TextHelper.EMPTY);
    }

    public static BranchEntity create() {
        return new BranchEntity(UUIDHelper.getDefault(), ParkingEntity.create(), TextHelper.EMPTY, CityEntity.create(), TextHelper.EMPTY, BranchTypeEntity.create(), TextHelper.EMPTY);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ParkingEntity getParking() {
        return parking;
    }

    public void setParking(ParkingEntity parking) {
        this.parking = parking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BranchTypeEntity getBranchType() {
        return branchType;
    }

    public void setBranchType(BranchTypeEntity branchType) {
        this.branchType = branchType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
