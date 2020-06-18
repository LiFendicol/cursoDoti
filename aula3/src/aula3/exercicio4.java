package aula3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int soma = 0;
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println ("Digite numero: ");
			num = ler.nextInt();
			if (num < 40) {
				soma = soma + num;
			}
		}
		System.out.println(soma);
	}

}
