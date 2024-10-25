package co.edu.uco.parquisoft.generales.domain.tipoidentificacion;

import co.edu.uco.parquisoft.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.parquisoft.generales.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public class TipoIdentificacionDomain {
    private UUID id;
    private String tipo;

    public TipoIdentificacionDomain(final UUID id, final String tipo) {
        setId(id);
        setTipo(tipo);
    }

    private void setId(UUID id) {
        this.id = UUIDHelper.getDefault(id,UUIDHelper.getDefault());
    }

    private void setTipo(String tipo) {
        this.tipo = TextHelper.applyTrim(tipo);
    }

    public UUID getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }
}
