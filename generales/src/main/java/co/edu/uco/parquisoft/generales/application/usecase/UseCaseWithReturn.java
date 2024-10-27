package co.edu.uco.parquisoft.generales.application.usecase;

public interface UseCaseWithReturn<D, R>{
	
	R execute(D domain);

}
