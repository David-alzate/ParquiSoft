package co.parquisoft.application.secondaryports.mapper.parkings;

import co.parquisoft.application.secondaryports.entity.parkings.BranchEntity;
import co.parquisoft.domain.parkings.branch.BranchDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BranchEntityMapper {

    BranchEntityMapper INSTANCE = Mappers.getMapper(BranchEntityMapper.class);

    BranchEntity toEntity(BranchDomain domain);

    List<BranchDomain> toDomainCollection(List<BranchEntity> entities);
}
