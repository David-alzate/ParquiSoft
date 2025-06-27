package co.parquisoft.application.secondaryports.repository.parkings;

import co.parquisoft.application.secondaryports.entity.parkings.ParkingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingRepository extends JpaRepository<ParkingEntity, UUID> {
}
