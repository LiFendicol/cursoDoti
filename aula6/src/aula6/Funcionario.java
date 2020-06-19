package aula6;

public class Funcionario {
	int idFunc;
	String nomeFunc;
	String departamento;
	String dataContratacao;
	double salario;
	String documento;
	boolean situacao;
	
	void Imprimir() {
		//System.out.println(idFunc);
		System.out.println(nomeFunc);
		//System.out.println(departamento);
		//System.out.println(dataContratacao);
		System.out.println(salario);
		//System.out.println(documento);
		VerificaFuncionario(situacao);
		
	}
	
	void AtualizarFuncionario(double aumento) {
		salario = salario * aumento;
	}
	
	private void VerificaFuncionario(boolean situacaoAux) {
		if (situacaoAux) {
			System.out.println("Ativo");
		} else {
			System.out.println("Desativo");
		}
	}
}
