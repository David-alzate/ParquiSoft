package co.parquisoft.application.secondaryports.repository.commons;

import java.util.List;

import org.springframework.stereotype.Service;

import co.parquisoft.application.secondaryports.entity.commons.VehicleTypeEntity;

@Service
public interface VehicleTypeRepositoryCustom {

	List<VehicleTypeEntity> findByFilter(VehicleTypeEntity filter);

}
