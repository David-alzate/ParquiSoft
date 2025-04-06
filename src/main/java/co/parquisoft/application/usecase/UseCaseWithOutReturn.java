package co.parquisoft.application.usecase;

public interface UseCaseWithOutReturn<D> {

	void execute(D domain);

}
