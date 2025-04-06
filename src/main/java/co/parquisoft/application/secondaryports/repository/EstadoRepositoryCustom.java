package co.parquisoft.application.secondaryports.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.parquisoft.application.secondaryports.entity.EstadoEntity;

@Repository
public interface EstadoRepositoryCustom {
	
	List<EstadoEntity> findByFilter(EstadoEntity filter);

}
