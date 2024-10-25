package co.edu.uco.parquisoft.generales.domain.tipoidentificacion.rules;

import co.edu.uco.parquisoft.generales.domain.DomainRule;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public interface TipoIdentificacionIdIsNotNullRule extends DomainRule<UUID> {
}
