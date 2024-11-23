package co.edu.uco.parquisoft.generales.application.secondaryports.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uco.parquisoft.generales.application.secondaryports.entity.TipoVehiculoEntity;

@Repository
public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculoEntity, UUID> {

}
