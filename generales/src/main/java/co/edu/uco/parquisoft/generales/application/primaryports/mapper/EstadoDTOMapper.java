package co.edu.uco.parquisoft.generales.application.primaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.uco.parquisoft.generales.application.primaryports.dto.EstadoDTO;
import co.edu.uco.parquisoft.generales.domain.estado.EstadoDomain;

@Mapper
public interface EstadoDTOMapper {

	EstadoDTOMapper INSTANCE = Mappers.getMapper(EstadoDTOMapper.class);

	EstadoDomain toDomain(EstadoDTO dto);

	List<EstadoDTO> toDtoCollection(List<EstadoDomain> domains);

}
