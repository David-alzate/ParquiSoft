package co.parquisoft.application.secondaryports.mapper.commons;

import co.parquisoft.application.secondaryports.entity.commons.VehicleTypeEntity;
import co.parquisoft.domain.commons.tipovehiculo.VehicleTypeDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface VehicleTypeEntityMapper {

    VehicleTypeEntityMapper INSTANCE = Mappers.getMapper(VehicleTypeEntityMapper.class);

    VehicleTypeEntity toEntity(VehicleTypeDomain domain);

    List<VehicleTypeDomain> toDomainCollection(List<VehicleTypeEntity> entities);

}
