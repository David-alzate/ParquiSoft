package co.edu.uco.parquisoft.generales.domain.estado;

import java.util.UUID;

import co.edu.uco.parquisoft.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.parquisoft.generales.domain.Domain;

public final class EstadoDomain extends Domain {

	private String name;

	public EstadoDomain(final UUID id, final String name) {
		super(id);
		setName(name);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = TextHelper.applyTrim(name);
	}

}
