package aula6;

import java.util.Scanner;

public class pessoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa ind = new Pessoa();
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite nome: ");
		ind.nome = ler.nextLine();
		System.out.println("Digite idade: ");
		ind.idade = ler.nextInt();
		System.out.println("Digite M ou F: ");
		ind.sexo = ler.next().charAt(0);
		
		//ind.Classificar(ind.idade);
		
		ind.imprimir();
		
	}

}
