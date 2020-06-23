package simuladorConta;

public class Cliente extends Pessoa{
	//CLasse de definição de cliente incluindo salario
	private double salario;
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Cliente (String nome, String cpf, double salario, int senha) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.salario = salario;
		this.setSenha(senha);
		seteCliente(true);
	}
}
