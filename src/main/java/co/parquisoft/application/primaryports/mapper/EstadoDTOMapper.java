package co.parquisoft.application.primaryports.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import co.parquisoft.application.primaryports.dto.EstadoDTO;
import co.parquisoft.domain.estado.EstadoDomain;

@Mapper
public interface EstadoDTOMapper {

	EstadoDTOMapper INSTANCE = Mappers.getMapper(EstadoDTOMapper.class);

	EstadoDomain toDomain(EstadoDTO dto);

	EstadoDTO toDto(EstadoDomain stateDomain);

	List<EstadoDTO> toDtoCollection(List<EstadoDomain> domains);

}
