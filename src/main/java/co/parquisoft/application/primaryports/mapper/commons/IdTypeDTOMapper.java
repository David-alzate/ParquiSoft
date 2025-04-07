package co.parquisoft.application.primaryports.mapper.commons;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.parquisoft.application.primaryports.dto.commons.IdTypeDTO;
import co.parquisoft.domain.commons.idtype.IdTypeDomain;

@Mapper
public interface IdTypeDTOMapper {

	IdTypeDTOMapper INSTANCE = Mappers.getMapper(IdTypeDTOMapper.class);

	IdTypeDomain toDomain(IdTypeDTO dto);
	
    IdTypeDTO toDto(IdTypeDomain domain);
    
    List<IdTypeDTO> toDtoCollection(List<IdTypeDomain> domains);

}
