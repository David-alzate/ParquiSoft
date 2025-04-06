package co.parquisoft.application.secondaryports.entity;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "TipoIdentificacion")
public final class TipoIdentificacionEntity {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "tipo")
    private String name;

    public TipoIdentificacionEntity() {
        setId(UUIDHelper.getDefault());
        setName(TextHelper.EMPTY);
    }

    public TipoIdentificacionEntity(final UUID id, final String name) {
        setId(id);
        setName(name);
    }

    static final TipoIdentificacionEntity create() {
        return new TipoIdentificacionEntity();
    }

    public static final TipoIdentificacionEntity create(final UUID id, final String name) {
        return new TipoIdentificacionEntity(id, name);
    }

    public static final TipoIdentificacionEntity create(final UUID id) {
        return new TipoIdentificacionEntity(id,TextHelper.EMPTY);
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
