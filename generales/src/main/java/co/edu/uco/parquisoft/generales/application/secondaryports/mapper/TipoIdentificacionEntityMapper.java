package co.edu.uco.parquisoft.generales.application.secondaryports.mapper;

import co.edu.uco.parquisoft.generales.application.secondaryports.entity.TipoIdentificacionEntity;
import co.edu.uco.parquisoft.generales.domain.tipoidentificacion.TipoIdentificacionDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TipoIdentificacionEntityMapper {

	TipoIdentificacionEntityMapper INSTANCE = Mappers.getMapper(TipoIdentificacionEntityMapper.class);

	TipoIdentificacionEntity toEntity(TipoIdentificacionDomain tipoIdentificacionDomain);

	List<TipoIdentificacionDomain> toDomainCollection(List<TipoIdentificacionEntity> tipoIdentificacionEntities);

}
