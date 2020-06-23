package interfaces;

public class Mulher extends Pessoa implements Casamento{
	
	public void casar() {
		System.out.println("Mulher "+getNome()+" achou um idiota ");
	}
	
	public Mulher(String nome) {
		this.setNome(nome);
	}

}
