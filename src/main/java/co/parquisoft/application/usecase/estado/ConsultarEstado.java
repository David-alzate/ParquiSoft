package co.parquisoft.application.usecase.estado;

import java.util.List;

import co.parquisoft.application.usecase.UseCaseWithReturn;
import co.parquisoft.domain.estado.EstadoDomain;

public interface ConsultarEstado extends UseCaseWithReturn<EstadoDomain, List<EstadoDomain>>{

}
