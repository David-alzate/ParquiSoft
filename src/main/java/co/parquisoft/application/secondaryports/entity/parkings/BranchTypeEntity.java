package co.parquisoft.application.secondaryports.entity.parkings;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "branch_type")
public class BranchTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;

    public BranchTypeEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public BranchTypeEntity(UUID id, String name) {
        setId(id);
        setName(name);
    }

    public static BranchTypeEntity create(UUID id, String name) {
        return new BranchTypeEntity(id, name);
    }

    public static BranchTypeEntity create(UUID id) {
        return new BranchTypeEntity(id, TextHelper.EMPTY);
    }

    public static BranchTypeEntity create() {
        return new BranchTypeEntity();
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
