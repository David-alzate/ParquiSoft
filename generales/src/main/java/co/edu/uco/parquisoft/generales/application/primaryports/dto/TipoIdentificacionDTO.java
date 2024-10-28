package co.edu.uco.parquisoft.generales.application.primaryports.dto;

import co.edu.uco.parquisoft.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.parquisoft.generales.crosscutting.helpers.UUIDHelper;

import java.util.UUID;

public final class TipoIdentificacionDTO {

	private UUID id;
	private String name;

	public TipoIdentificacionDTO() {
		setId(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
	}

	public TipoIdentificacionDTO(UUID id, String name) {
		setId(id);
		setName(name);
	}

	public static TipoIdentificacionDTO create() {
		return new TipoIdentificacionDTO();
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
