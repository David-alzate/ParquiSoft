package co.edu.uco.parquisoft.generales.application.usecase;

public interface UseCaseWithOutReturn<D> {

	void execute(D domain);

}
