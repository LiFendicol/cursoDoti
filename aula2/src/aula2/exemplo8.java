package aula2;

import java.util.Scanner;

public class exemplo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String estadoCivil=" ";
		String opcao;

		Scanner ler = new Scanner(System.in);
	
		System.out.println("Estado civil");
		System.out.println("1 - para solteiro");
		System.out.println("2 - para casado");
		System.out.println("3 - para outros");
		System.out.println("Escolha sua opção:");
		opcao = ler.next();

		try {
			Integer.parseInt(opcao);
		}
			catch (NumberFormatException e) {
			System.out.println("Por favor escolher entre 1,2 ou 3");
			System.exit(0);
			}
			catch (NullPointerException e) {
			System.out.println("Por favor escolher entre 1,2 ou 3");
			System.exit(0);
		}
	
		Integer.parseInt(opcao);

		if (Integer.parseInt(opcao) == 1) {
				estadoCivil = "solteiro";
		} else {
			if (Integer.parseInt(opcao) == 2) {
				estadoCivil = "casado";
			} else {
				if (Integer.parseInt(opcao) == 3) {
					estadoCivil = "outros";
				} else {
			System.out.println("Por favor escolher entre 1,2 ou 3");
				}
			}
		}
		System.out.println(estadoCivil);
		
	}
}
