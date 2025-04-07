package co.parquisoft.application.secondaryports.mapper.commons;

import co.parquisoft.application.secondaryports.entity.commons.IdTypeEntity;
import co.parquisoft.domain.commons.idtype.IdTypeDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IdTypeEntityMapper {

    IdTypeEntityMapper INSTANCE = Mappers.getMapper(IdTypeEntityMapper.class);

    IdTypeEntity toEntity(IdTypeDomain domain);

    List<IdTypeDomain> toDomainCollection(List<IdTypeEntity> entities);

}
