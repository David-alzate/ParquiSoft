package co.parquisoft.domain.tipoidentificacion.rules;

import co.parquisoft.domain.DomainRule;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public interface TipoIdentificacionIdDoesExistsRule extends DomainRule<UUID> {
}
