package heranca;

public class mainHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcionario f1 = new funcionario();
		
		f1.nome = "D";
		f1.salario = 100;
		f1.endereco = "R";
		
		professor p1 = new professor();
		
		p1.nome = "T";
		p1.salario = 100;
		p1.endereco = "X";
		p1.disciplina = "Dis";
		p1.titulacao = "Tit";
		
		p1.exibirDados();
		p1.exibirProfessor();
		
		atendente a1 = new atendente();
		a1.nome = "A";
		a1.salario = 10;
		a1.endereco = "F";
		a1.setor = "Vendas";
		
		a1.exibirDados();
		a1.exibeAtendente();

	}

}
