package co.edu.uco.parquisoft.generales.application.usecase.estado;

import java.util.List;

import co.edu.uco.parquisoft.generales.application.usecase.UseCaseWithReturn;
import co.edu.uco.parquisoft.generales.domain.estado.EstadoDomain;

public interface ConsultarEstado extends UseCaseWithReturn<EstadoDomain, List<EstadoDomain>>{

}
