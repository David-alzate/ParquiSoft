package co.edu.uco.parquisoft.generales.application.secondaryports.repository;

import co.edu.uco.parquisoft.generales.application.secondaryports.entity.TipoIdentificacionEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoIdentificacionRepositoryCustom {

	List<TipoIdentificacionEntity> findByFilter(TipoIdentificacionEntity filter);

}
