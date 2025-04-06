package co.parquisoft.application.primaryports.dto;

import java.util.UUID;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

public class TipoVehiculoDTO {

	private UUID id;
	private String name;

	public TipoVehiculoDTO() {
		setId(id);
		setName(name);
	}

	public TipoVehiculoDTO(UUID id, String name) {
		setId(id);
		setName(name);
	}

	public static TipoVehiculoDTO create(UUID id, String name) {
		return new TipoVehiculoDTO();
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
