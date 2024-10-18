package co.edu.uco.parquisoft.generales.domain;

public interface DomainRule <T>{
    void validate(T data);
}
