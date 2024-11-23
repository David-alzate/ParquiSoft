package co.edu.uco.parquisoft.generales.application.secondaryports.repository;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.uco.parquisoft.generales.application.secondaryports.entity.TipoVehiculoEntity;

@Service
public interface TipoVehiculoRepositoryCustom {

	List<TipoVehiculoEntity> findByFilter(TipoVehiculoEntity filter);

}
