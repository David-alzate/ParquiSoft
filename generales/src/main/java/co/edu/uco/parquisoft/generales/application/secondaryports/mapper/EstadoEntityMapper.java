package co.edu.uco.parquisoft.generales.application.secondaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.uco.parquisoft.generales.application.secondaryports.entity.EstadoEntity;
import co.edu.uco.parquisoft.generales.domain.estado.EstadoDomain;

@Mapper
public interface EstadoEntityMapper {

	EstadoEntityMapper INSTANCE = Mappers.getMapper(EstadoEntityMapper.class);

	EstadoEntity toEntity(EstadoDomain estadoDomain);

	List<EstadoDomain> toDomainCollection(List<EstadoEntity> stateEntities);

}
