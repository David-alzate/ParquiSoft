package co.parquisoft.application.primaryports.mapper.vehicle;

import co.parquisoft.application.primaryports.dto.vehicle.VehicleDTO;
import co.parquisoft.domain.vehicle.VehicleDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface VehicleDTOMapper {

    VehicleDTOMapper INSTANCE = Mappers.getMapper(VehicleDTOMapper.class);

    VehicleDomain toDomain(VehicleDTO dto);

    VehicleDTO toDto(VehicleDomain domain);

    List<VehicleDTO> toDtoCollection(List<VehicleDomain> domains);
}
