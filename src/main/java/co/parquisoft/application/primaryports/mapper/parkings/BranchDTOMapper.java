package co.parquisoft.application.primaryports.mapper.parkings;

import co.parquisoft.application.primaryports.dto.parkings.BranchDTO;
import co.parquisoft.domain.parkings.branch.BranchDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BranchDTOMapper {

    BranchDTOMapper INSTANCE = Mappers.getMapper(BranchDTOMapper.class);

    BranchDomain toDomain(BranchDTO dto);

    BranchDTO toDto(BranchDomain domain);

    List<BranchDTO> toDtoCollection(List<BranchDomain> domains);
}
