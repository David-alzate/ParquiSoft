package co.edu.uco.parquisoft.generales.application.usecase.tipoidentificacion;

import co.edu.uco.parquisoft.generales.application.usecase.UseCaseWithReturn;
import co.edu.uco.parquisoft.generales.domain.tipoidentificacion.TipoIdentificacionDomain;

import java.util.List;

public interface ConsultarTipoIdentificacion extends UseCaseWithReturn<TipoIdentificacionDomain, List<TipoIdentificacionDomain>> {
}
