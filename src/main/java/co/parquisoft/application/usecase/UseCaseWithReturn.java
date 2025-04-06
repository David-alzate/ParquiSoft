package co.parquisoft.application.usecase;

public interface UseCaseWithReturn<D, R>{
	
	R execute(D domain);

}
