package aula3;

import java.util.Scanner;

public class exemplo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Digite numero: ");
		opcao = ler.nextInt();
		
		switch (opcao) {
			case 1:
				System.out.println("Janeiro");
				break;
			case 2:
				System.out.println("Fevereiro");
				break;
			default:
				System.out.println("Nada");
				break;
		}
	}

}
