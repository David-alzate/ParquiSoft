package co.parquisoft.application.secondaryports.repository;

import co.parquisoft.application.secondaryports.entity.TipoIdentificacionEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoIdentificacionRepositoryCustom {

	List<TipoIdentificacionEntity> findByFilter(TipoIdentificacionEntity filter);

}
