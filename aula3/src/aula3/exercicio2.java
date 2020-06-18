package aula3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade=0;
		Scanner ler = new Scanner(System.in);
		
		while (idade != -99) {
			System.out.println ("Digite idade: ");
			idade = ler.nextInt();
			if (idade != -99) {
				System.out.println ("Idade é: "+idade);
			}
		}
		
	}

}
