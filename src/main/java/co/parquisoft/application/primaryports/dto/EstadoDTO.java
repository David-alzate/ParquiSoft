package co.parquisoft.application.primaryports.dto;

import java.util.UUID;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

public final class EstadoDTO {

	private UUID id;
	private String name;

	public EstadoDTO() {
		setId(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
	}

	public EstadoDTO(UUID id, String name) {
		setId(id);
		setName(name);
	}

	public static EstadoDTO create() {
		return new EstadoDTO();
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
