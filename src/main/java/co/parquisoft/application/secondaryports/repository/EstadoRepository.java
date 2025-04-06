package co.parquisoft.application.secondaryports.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.parquisoft.application.secondaryports.entity.EstadoEntity;

@Repository
public interface EstadoRepository extends JpaRepository<EstadoEntity, UUID>, EstadoRepositoryCustom{

}
