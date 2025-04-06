package co.parquisoft.application.secondaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.parquisoft.application.secondaryports.entity.TipoVehiculoEntity;
import co.parquisoft.domain.tipovehiculo.TipoVehiculoDomain;

@Mapper
public interface TipoVehiculoEntityMapper {

	TipoVehiculoEntityMapper INSTANCE = Mappers.getMapper(TipoVehiculoEntityMapper.class);

	TipoVehiculoEntity toEntity(TipoVehiculoDomain omain);

	List<TipoVehiculoDomain> toDomainCollection(List<TipoVehiculoEntity> stateEntities);

}
