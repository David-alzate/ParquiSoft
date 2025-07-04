package co.parquisoft.application.primaryports.dto.parkings;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class BranchTypeDTO {

    private UUID id;
    private String name;

    public BranchTypeDTO() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public BranchTypeDTO(UUID id, String name) {
        setId(id);
        setName(name);
    }

    public static BranchTypeDTO create(UUID id, String name) {
        return new BranchTypeDTO(id, name);
    }

    public static BranchTypeDTO create() {
        return new BranchTypeDTO();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = TextHelper.applyTrim(name);
    }
}
