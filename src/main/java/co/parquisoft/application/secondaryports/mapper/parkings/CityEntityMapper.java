package co.parquisoft.application.secondaryports.mapper.parkings;

import co.parquisoft.application.secondaryports.entity.parkings.CityEntity;
import co.parquisoft.domain.parkings.city.CityDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CityEntityMapper {

    CityEntityMapper INSTANCE = Mappers.getMapper(CityEntityMapper.class);

    CityEntity toEntity(CityDomain domain);

    List<CityDomain> toDomainCollection(List<CityEntity> entities);
}
