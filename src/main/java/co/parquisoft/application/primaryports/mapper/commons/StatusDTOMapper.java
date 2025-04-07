package co.parquisoft.application.primaryports.mapper.commons;

import co.parquisoft.application.primaryports.dto.commons.StatusDTO;
import co.parquisoft.domain.commons.status.StatusDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StatusDTOMapper {

    StatusDTOMapper INSTANCE = Mappers.getMapper(StatusDTOMapper.class);

    StatusDomain toDomain(StatusDTO dto);

    StatusDTO toDto(StatusDomain domain);

    List<StatusDTO> toDtoCollection(List<StatusDomain> domains);

}
