package simuladorConta;

import java.util.Scanner;

public class telaInicial {

	public static void main(String[] args) {
		//menu inicial para cliente
		
		cliente cliente1 = new cliente(); 
		conta conta1 = new conta();
		Scanner ler = new Scanner(System.in);
		
		//enquanto não temos banco de dados
		String clienteFixo1 = "D";
		
	
		System.out.printf ("Digite Agência: ");
		conta1.agencia = ler.nextInt();
		
		System.out.printf ("Digite Conta: ");
		conta1.codConta = ler.nextInt();	
		
		cliente1.senha = 1234;
		
		

	}

}
