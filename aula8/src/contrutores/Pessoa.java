package contrutores;

public class Pessoa {
	private String nome, sobrenome;
	private int idade;
	
	
	//Método contrutor...
	public Pessoa (String nome, String sobrenome, int idade) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setIdade(idade);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
