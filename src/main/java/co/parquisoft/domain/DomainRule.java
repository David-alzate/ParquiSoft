package co.parquisoft.domain;

public interface DomainRule <T>{
    void validate(T data);
}
