package co.parquisoft.application.secondaryports.repository.parkings;

import co.parquisoft.application.secondaryports.entity.parkings.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StateRepository extends JpaRepository<StateEntity, UUID> {
}
