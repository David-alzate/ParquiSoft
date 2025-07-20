package co.parquisoft.application.primaryports.mapper.parkings;

import co.parquisoft.application.primaryports.dto.parkings.ParkingSpotDTO;
import co.parquisoft.domain.parkings.parkingspot.ParkingSpotDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ParkingSpotDTOMapper {

    ParkingSpotDTOMapper INSTANCE = Mappers.getMapper(ParkingSpotDTOMapper.class);

    ParkingSpotDomain toDomain(ParkingSpotDTO dto);

    ParkingSpotDTO toDto(ParkingSpotDomain domain);

    List<ParkingSpotDTO> toDtoCollection(List<ParkingSpotDomain> domains);
}
