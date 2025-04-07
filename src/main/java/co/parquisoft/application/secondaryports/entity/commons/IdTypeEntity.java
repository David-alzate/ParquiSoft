package co.parquisoft.application.secondaryports.entity.commons;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "id_type")
public final class IdTypeEntity {

    @Id
    @Column(name = "id")
    private UUID id;
    private String name;

    public IdTypeEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public IdTypeEntity(final UUID id, final String name) {
        setId(id);
        setName(name);
    }

    static IdTypeEntity create() {
        return new IdTypeEntity();
    }

    public static IdTypeEntity create(final UUID id, final String name) {
        return new IdTypeEntity(id, name);
    }

    public static IdTypeEntity create(final UUID id) {
        return new IdTypeEntity(id, TextHelper.EMPTY);
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
