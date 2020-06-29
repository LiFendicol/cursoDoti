package heranca;

public class mainHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		funcionario f1 = new funcionario();
		
		f1.setNome("D");
		f1.setSalario(100);
		f1.setEndereco("R");
		
		professor p1 = new professor();
		
		p1.setNome("T");
		p1.setSalario(200);
		p1.setEndereco("X");
		p1.disciplina = "Dis";
		p1.titulacao = "Tit";
		
		p1.exibirDados();
		p1.exibirProfessor();
		
		atendente a1 = new atendente();
		a1.setNome("A");
		a1.setSalario(10);
		a1.setEndereco("F");
		a1.setor = "Vendas";
		
		a1.exibirDados();
		a1.exibeAtendente();

	}

}
