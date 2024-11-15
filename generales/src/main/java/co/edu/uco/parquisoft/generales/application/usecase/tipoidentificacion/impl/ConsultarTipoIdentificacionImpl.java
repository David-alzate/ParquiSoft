package co.edu.uco.parquisoft.generales.application.usecase.tipoidentificacion.impl;

import co.edu.uco.parquisoft.generales.application.secondaryports.mapper.TipoIdentificacionEntityMapper;
import co.edu.uco.parquisoft.generales.application.secondaryports.repository.TipoIdentificacionRepository;
import co.edu.uco.parquisoft.generales.application.usecase.tipoidentificacion.ConsultarTipoIdentificacion;
import co.edu.uco.parquisoft.generales.domain.tipoidentificacion.TipoIdentificacionDomain;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ConsultarTipoIdentificacionImpl implements ConsultarTipoIdentificacion {

    private TipoIdentificacionRepository tipoIdentificacionRepository;

    public ConsultarTipoIdentificacionImpl(TipoIdentificacionRepository tipoIdentificacionRepository) {
        this.tipoIdentificacionRepository = tipoIdentificacionRepository;
    }

    @Override
    public List<TipoIdentificacionDomain> execute(TipoIdentificacionDomain domain) {
        var tipoIdentificacionEntity = TipoIdentificacionEntityMapper.INSTANCE.toEntity(domain);
        var resultadosEntity = tipoIdentificacionRepository.findByFilter(tipoIdentificacionEntity);
        return TipoIdentificacionEntityMapper.INSTANCE.toDomainCollection(resultadosEntity);
    }
}
