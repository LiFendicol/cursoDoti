package aula2;

import java.util.Scanner;

public class exemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, media;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digitar nota 1:");
		nota1 = ler.nextInt();
	
		System.out.println("Digitar nota 2:");
		nota2 = ler.nextInt();
		
		media = (nota1+nota2)/2;
		
		if (media >= 7) {
				System.out.println("Aprovado");
				
		}else {
					System.out.println("Reprovado");
				}


	}

}
