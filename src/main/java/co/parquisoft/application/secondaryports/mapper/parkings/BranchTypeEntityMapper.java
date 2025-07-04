package co.parquisoft.application.secondaryports.mapper.parkings;

import co.parquisoft.application.secondaryports.entity.parkings.BranchTypeEntity;
import co.parquisoft.domain.parkings.branch.BranchTypeDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BranchTypeEntityMapper {

    BranchTypeEntityMapper INSTANCE = Mappers.getMapper(BranchTypeEntityMapper.class);

    BranchTypeEntity toEntity(BranchTypeDomain domain);

    List<BranchTypeDomain> toDomainCollection(List<BranchTypeEntity> entities);
}
