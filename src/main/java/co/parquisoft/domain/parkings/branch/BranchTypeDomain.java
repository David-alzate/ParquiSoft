package co.parquisoft.domain.parkings.branch;

import co.parquisoft.domain.Domain;

import java.util.UUID;

public class BranchTypeDomain extends Domain {

    private String name;

    public BranchTypeDomain(UUID id, String name) {
        super(id);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
