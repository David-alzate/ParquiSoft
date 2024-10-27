package co.edu.uco.parquisoft.generales.domain;

import java.util.UUID;

import co.edu.uco.parquisoft.generales.crosscutting.helpers.UUIDHelper;

public class Domain {
	
	private UUID id;

	protected Domain(final UUID id) {
		setId(id);

	}

	public final UUID getId() {
		return id;
	}

	private final void setId(UUID id) {
		this.id = id;
	}

	public void generateId() {
		this.id = UUIDHelper.generate();
	}

}
