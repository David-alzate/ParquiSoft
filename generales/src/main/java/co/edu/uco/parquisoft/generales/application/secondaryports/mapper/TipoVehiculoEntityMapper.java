package co.edu.uco.parquisoft.generales.application.secondaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.uco.parquisoft.generales.application.secondaryports.entity.TipoVehiculoEntity;
import co.edu.uco.parquisoft.generales.domain.tipovehiculo.TipoVehiculoDomain;

@Mapper
public interface TipoVehiculoEntityMapper {

	TipoVehiculoEntityMapper INSTANCE = Mappers.getMapper(TipoVehiculoEntityMapper.class);

	TipoVehiculoEntity toEntity(TipoVehiculoDomain omain);

	List<TipoVehiculoDomain> toDomainCollection(List<TipoVehiculoEntity> stateEntities);

}
