package co.parquisoft.application.secondaryports.mapper.parkings;

import co.parquisoft.application.secondaryports.entity.parkings.ParkingEntity;
import co.parquisoft.domain.parkings.parking.ParkingDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ParkingEntityMapper {

    ParkingEntityMapper INSTANCE = Mappers.getMapper(ParkingEntityMapper.class);

    ParkingEntity toEntity(ParkingDomain domain);

    List<ParkingDomain> toDomainCollection(List<ParkingEntity> entities);
}
