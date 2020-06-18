package aula2;

import java.util.Scanner;

public class exemplo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			String nome;
			int idade;
			Scanner ler = new Scanner(System.in);
		
			System.out.println("Digitar nome:");
			nome = ler.next();
		
			System.out.println("Digitar idade:");
			idade = ler.nextInt();
			
			if (idade < 16) {
				System.out.println(nome+" não eleitor");
			} else {
				if (idade >=18 && idade <65) {
					System.out.println(nome+" eleitor obrigatório");
				} else {
				System.out.println(nome+" eleitor facultativo");
			}
		}
	}
}
