package co.parquisoft.application.secondaryports.entity;

import java.util.UUID;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TipoVehiculo")
public final class TipoVehiculoEntity {

	@Id
	@Column(name = "id")
	private UUID id;

	@Column(name = "name")
	private String name;

	public TipoVehiculoEntity() {
		setId(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
	}

	public TipoVehiculoEntity(UUID id, String name) {
		setId(id);
		setName(name);
	}

	public static TipoIdentificacionEntity create() {
		return new TipoIdentificacionEntity();
	}

	public static TipoIdentificacionEntity create(UUID id) {
		return new TipoIdentificacionEntity(id, TextHelper.EMPTY);
	}

	public static TipoIdentificacionEntity create(UUID id, String name) {
		return new TipoIdentificacionEntity(id, name);
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
