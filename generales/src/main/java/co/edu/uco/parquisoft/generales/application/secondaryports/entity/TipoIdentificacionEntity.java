package co.edu.uco.parquisoft.generales.application.secondaryports.entity;

import co.edu.uco.parquisoft.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.parquisoft.generales.crosscutting.helpers.UUIDHelper;
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
    private String tipo;

    public TipoIdentificacionEntity() {
        setId(UUIDHelper.getDefault());
        setTipo(TextHelper.EMPTY);
    }

    public TipoIdentificacionEntity(final UUID id, final String tipo) {
        setId(id);
        setTipo(tipo);
    }

    static final TipoIdentificacionEntity create() {
        return new TipoIdentificacionEntity();
    }

    public static final TipoIdentificacionEntity create(final UUID id, final String tipo) {
        return new TipoIdentificacionEntity(id, tipo);
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = TextHelper.applyTrim(tipo);
    }
}
