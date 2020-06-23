package simuladorConta;

public abstract class Pessoa {
	//Classe abstrata para listar atributos de uma pessoa. E se é cliente ou não.
	private String nome;
	private String cpf;
	private int senha;
	private boolean eCliente;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	//não sei se vai dar tempo de verificar essa parte. Era algo para usar caso gerente usasse sistema
	public boolean iseCliente() {
		return eCliente;
	}
	public void seteCliente(boolean eCliente) {
		this.eCliente = eCliente;
	}
	
	public boolean validaSenha (int senhaDigitada) {
		if (senhaDigitada == getSenha()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
