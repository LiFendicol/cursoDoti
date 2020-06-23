package interfaces;

public class Homem extends Pessoa implements Casamento{

	public void casar() {
		System.out.println(getNome()+" dançou.");
	}
	
	public Homem(String nome) {
		this.setNome(nome);
	}
}
