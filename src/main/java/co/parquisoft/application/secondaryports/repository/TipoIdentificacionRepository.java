package co.parquisoft.application.secondaryports.repository;

import co.parquisoft.application.secondaryports.entity.TipoIdentificacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacionEntity, UUID>, TipoIdentificacionRepositoryCustom {
}
