package co.edu.uco.parquisoft.generales.application.primaryports.dto;

import java.util.UUID;

import co.edu.uco.parquisoft.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.parquisoft.generales.crosscutting.helpers.UUIDHelper;

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

	private void setId(UUID id) {
		this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = TextHelper.applyTrim(name);
	}

}
