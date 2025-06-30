package co.parquisoft.application.primaryports.mapper.parkings;

import co.parquisoft.application.primaryports.dto.parkings.BranchTypeDTO;
import co.parquisoft.domain.parkings.branch.BranchTypeDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BranchTypeDTOMapper {

    BranchTypeDTOMapper INSTANCE = Mappers.getMapper(BranchTypeDTOMapper.class);

    BranchTypeDomain toDomain(BranchTypeDTO dto);

    BranchTypeDTO toDto(BranchTypeDomain domain);

    List<BranchTypeDTO> toDtoCollection(List<BranchTypeDomain> domains);
}
