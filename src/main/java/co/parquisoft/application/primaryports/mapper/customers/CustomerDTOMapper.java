package co.parquisoft.application.primaryports.mapper.customers;

import co.parquisoft.application.primaryports.dto.customers.CustomerDTO;
import co.parquisoft.domain.customers.CustomerDomain;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerDTOMapper {

    CustomerDTOMapper INSTANCE = Mappers.getMapper(CustomerDTOMapper.class);

    CustomerDomain toDomain(CustomerDTO dto);

    CustomerDTO toDto(CustomerDomain domain);

    List<CustomerDTO> toDtoCollection(List<CustomerDomain> domains);
}
