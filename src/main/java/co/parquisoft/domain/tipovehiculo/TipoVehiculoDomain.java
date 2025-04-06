package co.parquisoft.domain.tipovehiculo;

import java.util.UUID;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.domain.Domain;

public final class TipoVehiculoDomain extends Domain {

	private String name;

	public TipoVehiculoDomain(UUID id, String name) {
		super(id);
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = TextHelper.applyTrim(name);
	}

}
