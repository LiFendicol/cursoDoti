package simuladorConta;

import java.util.Scanner;

public class telaInicial {

	public static void main(String[] args) {
		//menu inicial para cliente
		int digConta, digAgencia, digSenha, opcao; 
		double retirar, emprestimo;
		boolean sair = false;
		boolean temSaldoRetirar;
		Menu telaUser = new Menu();
		Scanner ler = new Scanner(System.in);
		
		// Não sei se vai dar tempo de montar um DB
		Cliente cliente1 = new Cliente(); 
		Cliente cliente2 = new Cliente(); 
		
		Conta conta1 = new Conta(); 
		Conta conta2 = new Conta(); 
		
		cliente1.setNome("John Smith");
		cliente1.setCpf("12312312312");
		cliente1.setSalario(5000);
		cliente1.setSenha(1234);
		conta1.setAgencia(1111);
		conta1.setCodConta(12121);
		conta1.setCpf("12312312312");
		conta1.setSaldo(3000);
		conta1.setQtdeRetiradas(0);

		cliente2.setNome("Lisa Trish");
		cliente2.setCpf("45645645645");
		cliente2.setSalario(7000);
		cliente2.setSenha(5678);
		conta2.setAgencia(2222);
		conta2.setCodConta(34343);
		conta2.setCpf("45645645645");
		conta2.setSaldo(1000);
		conta2.setQtdeRetiradas(0);
		// Fim de exemplos de clientes


		System.out.printf ("Digite Agência: ");
		digAgencia = ler.nextInt();
		
		System.out.printf ("Digite Conta: ");
		digConta = ler.nextInt();	
		
		System.out.printf ("Digite senha: ");
		digSenha = ler.nextInt();
			
		while (sair != true) {
			//Chamar menu inicial
			telaUser.telaInicial(cliente1.getNome());
			//
			opcao = ler.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Saldo em conta :"+conta1.getSaldo());
				break;
			case 2:
				if (conta1.getQtdeRetiradas() < 3) {
					System.out.println("Qual valor deseja ser retirado: ");
					retirar = ler.nextDouble();
					temSaldoRetirar = conta1.temSaldopararetirar(retirar);
					if (temSaldoRetirar == true) {
						conta1.removeSaldo(retirar, conta1.getQtdeRetiradas());
					} else {
						Emprestimo fazerEmprestimo = new Emprestimo();
						
						
					}
				} else {
					System.out.println("Máximo de retiradas por dia. Limite de 3 por dia");
				}
				break;
			case 3:
				System.out.println("Fevereiro");
				break;
			case 4:
				System.out.println("Fevereiro");
				break;
			case 5:
				System.out.println("Saindo do sistema");
				sair = true;
				break;
			default:
				System.out.println("Digite uma opção válida");
				break;

			}
		
		}

	}
}
