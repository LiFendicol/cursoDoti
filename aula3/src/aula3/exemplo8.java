package aula3;

import java.util.Scanner;

public class exemplo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int soma = 0;

		Scanner ler = new Scanner(System.in);

		do {
			System.out.printf("Digite valor: ");
			numero = ler.nextInt();
			soma = soma + numero;
			System.out.println(soma);
		} while (soma < 10);
	}
}
