package co.parquisoft.application.secondaryports.mapper.customers;

import co.parquisoft.application.secondaryports.entity.customers.CustomerEntity;
import co.parquisoft.domain.customers.CustomerDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerEntityMapper {

    CustomerEntityMapper INSTANCE = Mappers.getMapper(CustomerEntityMapper.class);

    CustomerEntity toEntity(CustomerDomain domain);

    List<CustomerDomain> toDomainCollection(List<CustomerEntity> entities);
}
