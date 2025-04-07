package co.parquisoft.application.primaryports.mapper.commons;

import co.parquisoft.application.primaryports.dto.commons.StatusTO;
import co.parquisoft.domain.commons.status.StatusDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StatusDTOMapper {

    StatusDTOMapper INSTANCE = Mappers.getMapper(StatusDTOMapper.class);

    StatusDomain toDomain(StatusTO dto);

    StatusTO toDto(StatusDomain domain);

    List<StatusTO> toDtoCollection(List<StatusDomain> domains);

}
