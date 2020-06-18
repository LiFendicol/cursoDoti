package exercicio1;

public class testeExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conta conta1 = new conta();
		pessoa pessoa1 = new pessoa ();
		
		conta1.nome = "Teste";
		conta1.saldo = 456;
		
		pessoa1.nome = "Teste";
		pessoa1.registro = 1;
		
		if (pessoa1.nome.equals(conta1.nome)) {
			pessoa1.mostrarDetalhes();
			conta1.extrato();
		}

	}

}
