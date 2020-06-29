package heranca;

public class funcionario {
	private String nome, endereco;
	private double salario;
	private String senha;
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	void setSalario(double salario) {
		this.salario = salario;
	}
	
	String getNome() {
		return this.nome;
	}

	String getEndereco() {
		return this.endereco;
	}
	
	double getSalario() {
		return this.salario;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	void exibirDados() {
		System.out.println(getNome());
		System.out.println(getEndereco());
		System.out.println(getSalario());
	}


}
