package co.parquisoft.application.primaryports.dto.commons;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public final class IdTypeDTO {

	private UUID id;
	private String name;

	public IdTypeDTO() {
		setId(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
	}

	public IdTypeDTO(UUID id, String name) {
		setId(id);
		setName(name);
	}

	public static IdTypeDTO create() {
		return new IdTypeDTO();
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
