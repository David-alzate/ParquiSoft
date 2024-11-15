package co.edu.uco.parquisoft.generales.application.primaryports.mapper;

import co.edu.uco.parquisoft.generales.application.primaryports.dto.EstadoDTO;
import co.edu.uco.parquisoft.generales.application.primaryports.dto.TipoIdentificacionDTO;
import co.edu.uco.parquisoft.generales.domain.estado.EstadoDomain;
import co.edu.uco.parquisoft.generales.domain.tipoidentificacion.TipoIdentificacionDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TipoIdentificacionDTOMapper {

	TipoIdentificacionDTOMapper INSTANCE = Mappers.getMapper(TipoIdentificacionDTOMapper.class);

	TipoIdentificacionDomain toDomain(TipoIdentificacionDTO tipoIdentificacionDTO);

	List<TipoIdentificacionDTO> toDtoCollection(List<TipoIdentificacionDomain> tipoIdentificaciondomains);

}
