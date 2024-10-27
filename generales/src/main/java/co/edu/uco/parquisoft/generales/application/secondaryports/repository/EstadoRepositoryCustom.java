package co.edu.uco.parquisoft.generales.application.secondaryports.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.uco.parquisoft.generales.application.secondaryports.entity.EstadoEntity;

@Repository
public interface EstadoRepositoryCustom {
	
	List<EstadoEntity> findByFilter(EstadoEntity filter);

}
