package simuladorConta;

public class Gerente extends Pessoa {

	public Gerente(String nome, int senha) {
		//Criei mais para questão de herança. Mas não sei não se vai dar tempo de implementar menu de gerente.
		this.setNome(nome);
		this.setSenha(senha);
		setCpf("GERENTE");
		seteCliente(false);
	}
	
}
