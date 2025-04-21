package co.parquisoft.application.secondaryports.entity.customer;

import co.parquisoft.application.secondaryports.entity.commons.IdTypeEntity;
import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @Column(name = "id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_type_id")
    private IdTypeEntity idType;
    private Long idNumber;
    private String name;
    private String surname;
    private String email;

    public CustomerEntity() {
        setId(UUIDHelper.getDefault());
        setIdType(co.parquisoft.application.secondaryports.entity.commons.IdTypeEntity.create());
        setIdNumber(0L);
        setName(TextHelper.EMPTY);
        setSurname(TextHelper.EMPTY);
        setEmail(TextHelper.EMPTY);
    }

    public CustomerEntity(UUID id, IdTypeEntity idType, Long idNumber, String name, String surname, String email) {
        setId(id);
        setIdType(idType);
        setIdNumber(idNumber);
        setName(name);
        setSurname(surname);
        setEmail(email);
    }

    public static CustomerEntity create(UUID id, IdTypeEntity idType, Long idNumber, String name, String surname, String email) {
        return new CustomerEntity(id, idType, idNumber, name, surname, email);
    }

    public static CustomerEntity create(UUID id) {
        return new CustomerEntity(id, IdTypeEntity.create(), 0L, TextHelper.EMPTY, TextHelper.EMPTY, TextHelper.EMPTY);
    }

    public static CustomerEntity create() {
        return new CustomerEntity();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public IdTypeEntity getIdType() {
        return idType;
    }

    public void setIdType(IdTypeEntity idType) {
        this.idType = idType;
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
