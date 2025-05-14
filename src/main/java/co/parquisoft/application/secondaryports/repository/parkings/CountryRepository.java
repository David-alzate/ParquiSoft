package co.parquisoft.application.secondaryports.repository.parkings;

import co.parquisoft.domain.parkings.CountryDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CountryRepository extends JpaRepository<CountryDomain, UUID> {
}
