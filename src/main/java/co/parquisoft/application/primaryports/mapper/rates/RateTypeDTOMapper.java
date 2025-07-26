package co.parquisoft.application.primaryports.mapper.rates;

import co.parquisoft.application.primaryports.dto.rates.RateTypeDTO;
import co.parquisoft.domain.rates.RateTypeDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RateTypeDTOMapper {

    RateTypeDTOMapper INSTANCE = Mappers.getMapper(RateTypeDTOMapper.class);

    RateTypeDomain toDomain(RateTypeDTO dto);

    RateTypeDTO toDto(RateTypeDomain domain);

    List<RateTypeDTO> toDtoCollection(List<RateTypeDomain> domains);
}
