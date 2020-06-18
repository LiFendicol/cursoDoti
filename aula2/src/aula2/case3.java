package aula2;

import java.util.Scanner;

public class case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b, res;
		String opcao;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		a = ler.nextInt();
		System.out.println("Digite o segundo número");
		b = ler.nextInt();
		
		System.out.println("|==================================|");
		System.out.println("     Calculadora Banco Cris S.A     ");
		System.out.println("|            Menu                  |");
		System.out.println("|                                  |");
		System.out.println("|  + - Somar                       |");
		System.out.println("|  - - Subtrair                    |");
		System.out.println("|  * - Multiplicar                 |");
		System.out.println("|  / - Dividir                     |");
		System.out.println("|                                  |");
		System.out.println("|==================================|");
		
		opcao = ler.next();
		
		if (opcao.equals("+")) {
			res = a + b;
			System.out.println("Soma: "+res);
		} else {
			if (opcao.equals("-")) {
				res = a - b;
				System.out.println("Subtração: "+res);	
			} else {
				if (opcao.equals("*")) {
					res = a * b;
					System.out.println("Multiplicação: "+res);	
				} else {
					if (opcao.equals("/")) {
						res = a / b;
						System.out.println("Divisão: "+res);
					} else {
						System.out.println("Opção inválida");	
					}
				}
			}
		}
	}

}
