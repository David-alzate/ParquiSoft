package co.parquisoft.application.usecase.tipoidentificacion;

import co.parquisoft.application.usecase.UseCaseWithReturn;
import co.parquisoft.domain.tipoidentificacion.TipoIdentificacionDomain;

import java.util.List;

public interface ConsultarTipoIdentificacion extends UseCaseWithReturn<TipoIdentificacionDomain, List<TipoIdentificacionDomain>> {
}
