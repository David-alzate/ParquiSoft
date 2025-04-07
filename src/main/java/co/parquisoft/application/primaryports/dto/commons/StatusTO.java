package co.parquisoft.application.primaryports.dto.commons;

import java.util.UUID;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

public final class StatusTO {

	private UUID id;
	private String name;

	public StatusTO() {
		setId(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
	}

	public StatusTO(UUID id, String name) {
		setId(id);
		setName(name);
	}

	public static StatusTO create() {
		return new StatusTO();
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
