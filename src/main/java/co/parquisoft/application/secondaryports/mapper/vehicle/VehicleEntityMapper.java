package co.parquisoft.application.secondaryports.mapper.vehicle;

import co.parquisoft.application.secondaryports.entity.vehicle.VehicleEntity;
import co.parquisoft.domain.vehicle.VehicleDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface VehicleEntityMapper {

    VehicleEntityMapper INSTANCE = Mappers.getMapper(VehicleEntityMapper.class);

    VehicleEntity toEntity(VehicleDomain domain);

    List<VehicleDomain> toDomainCollection(List<VehicleEntity> entities);
}
