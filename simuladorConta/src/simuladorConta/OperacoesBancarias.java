package simuladorConta;

public interface OperacoesBancarias {
	//So criei para implentar uma classe interface.
	//N�o vou fazer diferentes tipos de conta nesse momento.

	public void adicionaSaldo(double deposito);
	
	public void removeSaldo(double retirar, Cliente c1);
	
	public void verSaldo();
	
}
