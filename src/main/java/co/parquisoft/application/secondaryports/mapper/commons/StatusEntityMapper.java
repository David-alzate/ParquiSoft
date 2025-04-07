package co.parquisoft.application.secondaryports.mapper.commons;

import co.parquisoft.application.secondaryports.entity.commons.StatusEntity;
import co.parquisoft.domain.commons.status.StatusDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StatusEntityMapper {

    StatusEntityMapper INSTANCE = Mappers.getMapper(StatusEntityMapper.class);

    StatusEntity toEntity(StatusDomain domain);

    List<StatusDomain> toDomainCollection(List<StatusEntity> entities);

}
