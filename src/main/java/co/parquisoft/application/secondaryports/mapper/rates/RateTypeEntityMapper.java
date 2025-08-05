package co.parquisoft.application.secondaryports.mapper.rates;

import co.parquisoft.application.secondaryports.entity.rates.RateTypeEntity;
import co.parquisoft.domain.rates.RateTypeDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RateTypeEntityMapper {

    RateTypeEntityMapper INSTANCE = Mappers.getMapper(RateTypeEntityMapper.class);

    RateTypeEntity toEntity(RateTypeDomain domain);

    List<RateTypeDomain> toDomainCollection(List<RateTypeEntity> entities);
}
