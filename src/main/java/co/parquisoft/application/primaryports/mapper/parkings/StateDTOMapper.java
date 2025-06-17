package co.parquisoft.application.primaryports.mapper.parkings;

import co.parquisoft.application.primaryports.dto.parkings.StateDTO;
import co.parquisoft.domain.parkings.state.StateDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StateDTOMapper {

    StateDTOMapper INSTANCE = Mappers.getMapper(StateDTOMapper.class);

    StateDomain toDomain(StateDTO dto);

    StateDTO toDto(StateDomain domain);

    List<StateDTO> toDtoCollection(List<StateDomain> domains);
}
