package interfaces;

public class Homem extends Pessoa implements Casamento{

	public void casar() {
		System.out.println(getNome()+" dan�ou.");
	}
	
	public Homem(String nome) {
		this.setNome(nome);
	}
}
