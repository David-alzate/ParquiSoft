package co.edu.uco.parquisoft.generales.application.primaryports.interactor;

public interface InteractorWithReturn<T, R> {
	
	R execute(T data);

}
