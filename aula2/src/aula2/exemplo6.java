package aula2;

import java.util.Scanner;

public class exemplo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade;
		Scanner ler = new Scanner(System.in);
	
		System.out.println("Digitar nome:");
		nome = ler.next();
	
		System.out.println("Digitar idade:");
		idade = ler.nextInt();
		
		if (idade>=18) {
			System.out.println(nome+" � maior de 18 anos");
		} else {
			System.out.println(nome+" � menor de 18 anos");
		}

	}

}
