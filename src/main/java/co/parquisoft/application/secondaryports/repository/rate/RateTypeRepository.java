package co.parquisoft.application.secondaryports.repository.rate;

import co.parquisoft.application.secondaryports.entity.rates.RateTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RateTypeRepository extends JpaRepository<RateTypeEntity, UUID> {
}
