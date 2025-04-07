package co.parquisoft.application.secondaryports.repository.commons;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.parquisoft.application.secondaryports.entity.commons.StatusEntity;

@Repository
public interface StatusRepositoryCustom {
	
	List<StatusEntity> findByFilter(StatusEntity filter);

}
