package co.parquisoft.application.primaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.parquisoft.application.primaryports.dto.TipoIdentificacionDTO;
import co.parquisoft.domain.tipoidentificacion.TipoIdentificacionDomain;

@Mapper
public interface TipoIdentificacionDTOMapper {

	TipoIdentificacionDTOMapper INSTANCE = Mappers.getMapper(TipoIdentificacionDTOMapper.class);

	TipoIdentificacionDomain toDomain(TipoIdentificacionDTO dto);
	
    TipoIdentificacionDTO toDto(TipoIdentificacionDomain domain);
    
    List<TipoIdentificacionDTO> toDtoCollection(List<TipoIdentificacionDomain> domains);

}
