package co.parquisoft.application.primaryports.mapper.parkings;

import co.parquisoft.application.primaryports.dto.parkings.CityDTO;
import co.parquisoft.domain.parkings.city.CityDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CityDTOMapper {

    CityDTOMapper INSTANCE = Mappers.getMapper(CityDTOMapper.class);

    CityDomain toDomain(CityDTO dto);

    CityDTO toDto(CityDomain domain);

    List<CityDTO> toDtoCollection(List<CityDomain> domains);
}
