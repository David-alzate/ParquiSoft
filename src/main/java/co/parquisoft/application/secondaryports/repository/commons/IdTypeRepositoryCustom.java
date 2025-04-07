package co.parquisoft.application.secondaryports.repository.commons;

import co.parquisoft.application.secondaryports.entity.commons.IdTypeEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdTypeRepositoryCustom {

	List<IdTypeEntity> findByFilter(IdTypeEntity filter);

}
