package co.parquisoft.application.primaryports.mapper.commons;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.parquisoft.application.primaryports.dto.commons.VehicleTypeDTO;
import co.parquisoft.domain.commons.tipovehiculo.VehicleTypeDomain;

@Mapper
public interface VehicleTypeDTOMapper {

	VehicleTypeDTOMapper INSTANCE = Mappers.getMapper(VehicleTypeDTOMapper.class);

	VehicleTypeDomain toDomain(VehicleTypeDTO dto);

	VehicleTypeDTO toDto(VehicleTypeDomain domain);

	List<VehicleTypeDTO> toDtoCollection(List<VehicleTypeDomain> domains);

}
