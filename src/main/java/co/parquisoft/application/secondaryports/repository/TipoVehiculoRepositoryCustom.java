package co.parquisoft.application.secondaryports.repository;

import java.util.List;

import org.springframework.stereotype.Service;

import co.parquisoft.application.secondaryports.entity.TipoVehiculoEntity;

@Service
public interface TipoVehiculoRepositoryCustom {

	List<TipoVehiculoEntity> findByFilter(TipoVehiculoEntity filter);

}
