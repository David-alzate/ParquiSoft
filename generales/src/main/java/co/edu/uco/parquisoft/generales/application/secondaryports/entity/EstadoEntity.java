package co.edu.uco.parquisoft.generales.application.secondaryports.entity;

import java.util.UUID;

import co.edu.uco.parquisoft.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.parquisoft.generales.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Estado")
public final class EstadoEntity {

	@Id
	@Column(name = "id")
	private UUID id;

	@Column(name = "name")
	private String name;

	EstadoEntity() {
		setId(UUIDHelper.getDefault());
		setName(TextHelper.EMPTY);
	}

	public EstadoEntity(final UUID id, final String name) {
		setId(id);
		setName(name);
	}

	public static EstadoEntity create(final UUID id, final String name) {
		return new EstadoEntity(id, name);
	}

	public static EstadoEntity create(final UUID id) {
		return new EstadoEntity(id, TextHelper.EMPTY);
	}

	public static EstadoEntity create() {
		return new EstadoEntity();
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
