package aula1;

import java.util.Scanner;

public class case5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double deposito, rendimento, valorAposMes;
		
		rendimento = 0.7;
				
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digitar valor depositado:");
		
		deposito = ler.nextDouble();
		
		valorAposMes = deposito+((deposito*rendimento)/100);
		
		System.out.println("Valor após 1 mês com "+rendimento+" de rendimento mensal: "+valorAposMes);
		

	}

}
