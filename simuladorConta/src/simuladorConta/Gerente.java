package simuladorConta;

public class Gerente extends Pessoa {

	public Gerente(String nome, int senha) {
		//Criei mais para quest�o de heran�a. Mas n�o sei n�o se vai dar tempo de implementar menu de gerente.
		this.setNome(nome);
		this.setSenha(senha);
		setCpf("GERENTE");
		seteCliente(false);
	}
	
}
