package co.edu.uco.parquisoft.generales.application.primaryports.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import co.edu.uco.parquisoft.generales.application.primaryports.dto.TipoVehiculoDTO;
import co.edu.uco.parquisoft.generales.domain.tipovehiculo.TipoVehiculoDomain;

@Mapper
public interface TipoVehiculoDTOMapper {

	TipoVehiculoDTOMapper INSTANCE = Mappers.getMapper(TipoVehiculoDTOMapper.class);

	TipoVehiculoDomain toDomain(TipoVehiculoDTO dto);

	TipoVehiculoDTO toDto(TipoVehiculoDomain domain);

	List<TipoVehiculoDTO> toDtoCollection(List<TipoVehiculoDomain> domains);

}
