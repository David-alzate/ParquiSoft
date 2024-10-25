package co.edu.uco.parquisoft.generales.application.secondaryports.repository;

import co.edu.uco.parquisoft.generales.application.secondaryports.entity.TipoIdentificacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacionEntity, UUID>, TipoIdentificacionRepositoryCustom {
}
