package co.edu.uco.parquisoft.generales.application.primaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.uco.parquisoft.generales.application.primaryports.dto.TipoIdentificacionDTO;
import co.edu.uco.parquisoft.generales.domain.tipoidentificacion.TipoIdentificacionDomain;

@Mapper
public interface TipoIdentificacionDTOMapper {

	TipoIdentificacionDTOMapper INSTANCE = Mappers.getMapper(TipoIdentificacionDTOMapper.class);

	TipoIdentificacionDomain toDomain(TipoIdentificacionDTO dto);
	
    TipoIdentificacionDTO toDto(TipoIdentificacionDomain domain);
    
    List<TipoIdentificacionDTO> toDtoCollection(List<TipoIdentificacionDomain> domains);

}
