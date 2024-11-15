package co.edu.uco.parquisoft.generales.domain.tipoidentificacion;

import co.edu.uco.parquisoft.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.parquisoft.generales.crosscutting.helpers.UUIDHelper;
import co.edu.uco.parquisoft.generales.domain.Domain;

import java.util.UUID;

public class TipoIdentificacionDomain extends Domain {
    private String tipo;

    protected TipoIdentificacionDomain(final UUID id, final String tipo) {
        super(id);
        setTipo(tipo);
    }
    private void setTipo(String tipo) {
        this.tipo = TextHelper.applyTrim(tipo);
    }

    public String getTipo() {
        return tipo;
    }
}
