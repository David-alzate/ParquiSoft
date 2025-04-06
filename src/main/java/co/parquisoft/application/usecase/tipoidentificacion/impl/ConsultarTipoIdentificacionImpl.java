package co.parquisoft.application.usecase.tipoidentificacion.impl;

import co.parquisoft.application.secondaryports.mapper.TipoIdentificacionEntityMapper;
import co.parquisoft.application.secondaryports.repository.TipoIdentificacionRepository;
import co.parquisoft.application.usecase.tipoidentificacion.ConsultarTipoIdentificacion;
import co.parquisoft.domain.tipoidentificacion.TipoIdentificacionDomain;
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
