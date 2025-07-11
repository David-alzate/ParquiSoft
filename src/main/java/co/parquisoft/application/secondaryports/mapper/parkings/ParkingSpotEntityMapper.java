package co.parquisoft.application.secondaryports.mapper.parkings;

import co.parquisoft.application.secondaryports.entity.parkings.ParkingSpotEntity;
import co.parquisoft.domain.parkings.parkingspot.ParkingSpotDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ParkingSpotEntityMapper {

    ParkingSpotEntityMapper INSTANCE = Mappers.getMapper(ParkingSpotEntityMapper.class);

    ParkingSpotEntity toEntity(ParkingSpotDomain domain);

    List<ParkingSpotDomain> toDomainCollection(List<ParkingSpotEntity> entities);
}
