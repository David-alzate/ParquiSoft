package co.parquisoft.application.secondaryports.repository.customers;

import co.parquisoft.application.secondaryports.entity.customers.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, UUID> {
}
