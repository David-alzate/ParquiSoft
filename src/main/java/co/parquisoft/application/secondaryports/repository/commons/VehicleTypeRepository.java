package co.parquisoft.application.secondaryports.repository.commons;

import co.parquisoft.application.secondaryports.entity.commons.VehicleTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleTypeEntity, UUID> {

}
