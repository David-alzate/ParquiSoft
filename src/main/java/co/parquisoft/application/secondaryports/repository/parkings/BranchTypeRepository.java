package co.parquisoft.application.secondaryports.repository.parkings;

import co.parquisoft.application.secondaryports.entity.parkings.BranchTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BranchTypeRepository extends JpaRepository<BranchTypeEntity, UUID> {
}
