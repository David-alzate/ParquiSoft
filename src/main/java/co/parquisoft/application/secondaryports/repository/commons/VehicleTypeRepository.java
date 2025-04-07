package co.parquisoft.application.secondaryports.repository.commons;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.parquisoft.application.secondaryports.entity.commons.VehicleTypeEntity;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleTypeEntity, UUID>, VehicleTypeRepositoryCustom {

}
