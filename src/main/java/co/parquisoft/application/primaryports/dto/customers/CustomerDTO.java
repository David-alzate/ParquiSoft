package co.parquisoft.application.primaryports.dto.customers;

import co.parquisoft.application.primaryports.dto.commons.IdTypeDTO;
import co.parquisoft.crosscutting.helpers.ObjectHelper;
import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class CustomerDTO {

    private UUID id;
    private IdTypeDTO idType;
    private Long idNumber;
    private String name;
    private String surname;
    private String email;

    public CustomerDTO() {
        setId(UUIDHelper.getDefault());
        setIdType(IdTypeDTO.create());
        setIdNumber(0L);
        setName(TextHelper.EMPTY);
        setSurname(TextHelper.EMPTY);
        setEmail(TextHelper.EMPTY);
    }

    public CustomerDTO(UUID id, IdTypeDTO idType, Long idNumber, String name, String surname, String email) {
        setId(id);
        setIdType(idType);
        setIdNumber(idNumber);
        setName(name);
        setSurname(surname);
        setEmail(email);
    }

    public static CustomerDTO create(UUID id, IdTypeDTO idType, Long idNumber, String name, String surname, String email) {
        return new CustomerDTO(id, idType, idNumber, name, surname, email);
    }

    public static CustomerDTO create() {
        return new CustomerDTO();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    public IdTypeDTO getIdType() {
        return idType;
    }

    public void setIdType(IdTypeDTO idType) {
        this.idType = ObjectHelper.getDefault(idType, IdTypeDTO.create());
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
        this.name = TextHelper.applyTrim(name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = TextHelper.applyTrim(surname);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = TextHelper.applyTrim(email);
    }
}
