package co.parquisoft.domain.estado;

import java.util.UUID;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.domain.Domain;

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
