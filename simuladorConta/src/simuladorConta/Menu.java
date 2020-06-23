package simuladorConta;

import java.util.Scanner;

public class Menu {
	//Tá ficando grande demais....
	int digConta, digAgencia, digSenha, opcao;
	private double deposito, retirar;
	private boolean sair = false;
	
	//Devia ser pede Dado e já valida senha digitada, mas....
	void pedeDados(Cliente c1) {
		Scanner ler = new Scanner(System.in);
		System.out.printf ("Digite Agência: ");
		this.digAgencia = ler.nextInt();
	
		System.out.printf ("Digite Conta: ");
		this.digConta = ler.nextInt();	
	
		System.out.printf ("Digite senha: ");
		this.digSenha = ler.nextInt();
		
		if (!c1.validaSenha(this.digSenha)) {
			System.out.println("Senha incorreta. Saindo do sistema.");
			//Nem implantei loop nessa.... Sai do sistema direto....
			System.exit(0);
		}
	}
	
	//Tela inicial de opções - Unico método publico de menu
	public void telaInicial(Cliente c1, Conta cont1) {
		Scanner ler = new Scanner(System.in);
		System.out.println("|==================================|");
		System.out.println("         Banco Cris S.A             ");
		System.out.println("           Bem vindo                ");
		System.out.println("|  "+c1.getNome());
		System.out.println("|                                  |");
		System.out.println("|            Menu                  |");
		System.out.println("|                                  |");
		System.out.println("|  1 - Saldo                       |");
		System.out.println("|  2 - Retirada                    |");
		System.out.println("|  3 - Deposito                    |");
		System.out.println("|  4 - Transferencia               |");
		System.out.println("|  5 - Sair                        |");
		System.out.println("|==================================|");
		System.out.println("|Digite opção de 1 a 5:            |");
		System.out.println("|==================================|");
		opcao = ler.nextInt();
		aplicaOpcao(opcao,c1,cont1);
	}
	
	//Chamar menu inicial
	private void aplicaOpcao(int opcao, Cliente c1, Conta cont1) {
		switch (opcao) {
		case 1:
			verificaSaldo(cont1);
			break;
		case 2:
			menuRetira(cont1,c1);
			break;
		case 3:
			menuDeposita(cont1);
			break;
		case 4:
			menuTransfere();
			break;
		case 5:
			System.out.println("Saindo do sistema");
			setSair(true);
			break;
		default:
			System.out.println("Digite uma opção válida");
			break;
		}
	}
	
	private void verificaSaldo(Conta cont1){
		System.out.println("Saldo em conta :"+cont1.getSaldo());	
	}
	
	private void menuDeposita(Conta cont1){
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite valor para deposito: ");
		this.deposito = ler.nextDouble();
		cont1.adicionaSaldo(this.deposito);
	}
	
	private void menuRetira(Conta cont1, Cliente c1){
		if (cont1.getQtdeRetiradas() < 3) {
			Scanner ler = new Scanner(System.in);
			System.out.println("Qual valor deseja ser retirado: ");
			retirar = ler.nextDouble();
			cont1.removeSaldo(retirar,c1);
		} else {
			System.out.println("Retirada não permitida. Máximo de 3 retiradas por dia.");
			verificaSaldo(cont1);			
		}
	}
	
	private void menuTransfere(){
		
	}
	
	private void menuEmprestimo(){
		
	}
	
	public boolean getSair () {
		return this.sair;
	}
	
	void setSair (boolean sair) {
		this.sair = sair;
	}
}

