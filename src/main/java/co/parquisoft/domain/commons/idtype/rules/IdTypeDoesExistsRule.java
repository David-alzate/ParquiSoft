package co.parquisoft.domain.commons.idtype.rules;

import co.parquisoft.domain.DomainRule;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public interface IdTypeDoesExistsRule extends DomainRule<UUID> {
}
