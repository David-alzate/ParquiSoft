package co.parquisoft.domain.commons.idtype;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.domain.Domain;

import java.util.UUID;

public class IdTypeDomain extends Domain {
	
	private String name;

	public IdTypeDomain(final UUID id, final String name) {
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
