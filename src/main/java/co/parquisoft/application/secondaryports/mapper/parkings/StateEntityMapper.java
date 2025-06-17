package co.parquisoft.application.secondaryports.mapper.parkings;

import co.parquisoft.application.secondaryports.entity.parkings.StateEntity;
import co.parquisoft.domain.parkings.state.StateDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StateEntityMapper {

    StateEntityMapper INSTANCE = Mappers.getMapper(StateEntityMapper.class);

    StateEntity toEntity(StateDomain domain);

    List<StateDomain> toDomainCollection(List<StateEntity> entities);
}
