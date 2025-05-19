package co.parquisoft.application.primaryports.mapper.parkings;

import co.parquisoft.application.primaryports.dto.parkings.CountryDTO;
import co.parquisoft.domain.parkings.country.CountryDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CountryDTOMapper {

    CountryDTOMapper INSTANCE = Mappers.getMapper(CountryDTOMapper.class);

    CountryDomain toDomain(CountryDTO dto);

    CountryDTO toDto(CountryDomain domain);

    List<CountryDTO> toDtoCollection(List<CountryDomain> domains);
}
