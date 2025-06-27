package co.parquisoft.application.primaryports.mapper.parkings;

import co.parquisoft.application.primaryports.dto.parkings.ParkingDTO;
import co.parquisoft.domain.parkings.parking.ParkingDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ParkingDTOMapper {

    ParkingDTOMapper INSTANCE = Mappers.getMapper(ParkingDTOMapper.class);

    ParkingDomain toDomain(ParkingDTO dto);

    ParkingDTO toDto(ParkingDomain domain);

    List<ParkingDTO> toDtoCollection(List<ParkingDomain> domains);
}
