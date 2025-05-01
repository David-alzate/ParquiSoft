package co.parquisoft.application.secondaryports.entity.commons;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "status")
public final class StatusEntity {

    @Id
    @Column(name = "id")
    private UUID id;
    private String name;

    public StatusEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public StatusEntity(final UUID id, final String name) {
        setId(id);
        setName(name);
    }

    public static StatusEntity create(final UUID id, final String name) {
        return new StatusEntity(id, name);
    }

    public static StatusEntity create(final UUID id) {
        return new StatusEntity(id, TextHelper.EMPTY);
    }

    public static StatusEntity create() {
        return new StatusEntity();
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
