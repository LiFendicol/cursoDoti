package aula1;

import java.util.Scanner;

public class exemplo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome,sobrenome;
		int idade=10;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digitar nome:");
		
		nome = ler.next();
		
		System.out.println("Digitar Sobrenome:");
		
		sobrenome = ler.next();
		
		System.out.println("Idade:");
		
		idade = ler.nextInt();
		
		System.out.println(nome+" "+sobrenome+", "+idade);
	}

}