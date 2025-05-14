package co.parquisoft.application.secondaryports.mapper.parkings;

import co.parquisoft.application.secondaryports.entity.parkings.CountryEntity;
import co.parquisoft.domain.parkings.CountryDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CountryEntityMapper {

    CountryEntityMapper INSTANCE = Mappers.getMapper(CountryEntityMapper.class);

    CountryEntity toEntity(CountryDomain domain);

    List<CountryDomain> toDomainCollection(List<CountryEntity> entities);
}
