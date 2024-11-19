package co.edu.uco.parquisoft.generales.application.primaryports.interactor.tipoidentificacion.impl;

import co.edu.uco.parquisoft.generales.application.primaryports.dto.TipoIdentificacionDTO;
import co.edu.uco.parquisoft.generales.application.primaryports.interactor.tipoidentificacion.ConsultarTIdentificacionInteractor;
import co.edu.uco.parquisoft.generales.application.primaryports.mapper.TipoIdentificacionDTOMapper;
import co.edu.uco.parquisoft.generales.application.usecase.tipoidentificacion.ConsultarTipoIdentificacion;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ConsultarTIdentificacionInteractorImpl implements ConsultarTIdentificacionInteractor {

	private ConsultarTipoIdentificacion consultarTipoIdentificacion;

	public ConsultarTIdentificacionInteractorImpl(ConsultarTipoIdentificacion consultarTipoIdentificacion) {
		this.consultarTipoIdentificacion = consultarTipoIdentificacion;
	}

	@Override
	public List<TipoIdentificacionDTO> execute(TipoIdentificacionDTO data) {

		var tipoidentificaciondomain = TipoIdentificacionDTOMapper.INSTANCE.toDomain(data);
		var resultados = consultarTipoIdentificacion.execute(tipoidentificaciondomain);
		return TipoIdentificacionDTOMapper.INSTANCE.toDtoCollection(resultados);
	}
}
