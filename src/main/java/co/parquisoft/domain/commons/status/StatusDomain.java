package co.parquisoft.domain.commons.status;

import co.parquisoft.crosscutting.helpers.TextHelper;
import co.parquisoft.domain.Domain;

import java.util.UUID;

public final class StatusDomain extends Domain {

    private String name;

    public StatusDomain(final UUID id, final String name) {
        super(id);
        setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = TextHelper.applyTrim(name);
    }

}
