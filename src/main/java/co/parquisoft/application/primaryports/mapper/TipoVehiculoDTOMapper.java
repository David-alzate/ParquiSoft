package co.parquisoft.application.primaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.parquisoft.application.primaryports.dto.TipoVehiculoDTO;
import co.parquisoft.domain.tipovehiculo.TipoVehiculoDomain;

@Mapper
public interface TipoVehiculoDTOMapper {

	TipoVehiculoDTOMapper INSTANCE = Mappers.getMapper(TipoVehiculoDTOMapper.class);

	TipoVehiculoDomain toDomain(TipoVehiculoDTO dto);

	TipoVehiculoDTO toDto(TipoVehiculoDomain domain);

	List<TipoVehiculoDTO> toDtoCollection(List<TipoVehiculoDomain> domains);

}
