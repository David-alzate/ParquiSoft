package co.parquisoft.domain.customers;

import co.parquisoft.application.primaryports.dto.commons.IdTypeDTO;
import co.parquisoft.domain.Domain;

import java.util.UUID;

public class CustomerDomain extends Domain {

    private IdTypeDTO idType;
    private Long idNumber;
    private String name;
    private String surname;
    private String email;

    public CustomerDomain(UUID id, IdTypeDTO idType, Long idNumber, String name, String surname, String email) {
        super(id);
        setIdType(idType);
        setIdNumber(idNumber);
        setName(name);
        setSurname(surname);
        setEmail(email);
    }

    public IdTypeDTO getIdType() {
        return idType;
    }

    public void setIdType(IdTypeDTO idType) {
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
