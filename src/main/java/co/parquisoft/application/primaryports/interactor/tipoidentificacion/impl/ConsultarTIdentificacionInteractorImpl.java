package co.parquisoft.application.primaryports.interactor.tipoidentificacion.impl;

import co.parquisoft.application.primaryports.dto.TipoIdentificacionDTO;
import co.parquisoft.application.primaryports.interactor.tipoidentificacion.ConsultarTIdentificacionInteractor;
import co.parquisoft.application.primaryports.mapper.TipoIdentificacionDTOMapper;
import co.parquisoft.application.usecase.tipoidentificacion.ConsultarTipoIdentificacion;
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
