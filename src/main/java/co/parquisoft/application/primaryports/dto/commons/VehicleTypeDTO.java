package co.parquisoft.application.primaryports.dto.commons;

import java.util.UUID;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;

public class VehicleTypeDTO {

	private UUID id;
	private String name;

	public VehicleTypeDTO() {
		setId(id);
		setName(name);
	}

	public VehicleTypeDTO(UUID id, String name) {
		setId(id);
		setName(name);
	}

	public static VehicleTypeDTO create(UUID id, String name) {
		return new VehicleTypeDTO();
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
