package co.edu.uco.parquisoft.generales.domain.tipoidentificacion;

import co.edu.uco.parquisoft.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.parquisoft.generales.domain.Domain;

import java.util.UUID;

public class TipoIdentificacionDomain extends Domain {
	
	private String name;

	public TipoIdentificacionDomain(final UUID id, final String name) {
		super(id);
		setName(name);
	}

	public void setName(String name) {
		this.name = TextHelper.applyTrim(name);
	}

	public String getName() {
		return name;
	}
}
