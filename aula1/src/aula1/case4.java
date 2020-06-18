package aula1;

import java.util.Scanner;

public class case4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valorReal,qtdeDolar,valorDolar;
		
				
		Scanner ler = new Scanner(System.in);
		

		System.out.println("Qual cotação dólar:");
		
		valorDolar = ler.nextFloat();
		
		System.out.println("Quantos dolares possui:");
		
		qtdeDolar = ler.nextFloat();

		valorReal = valorDolar*qtdeDolar;
		
		System.out.println("Valor em real: "+valorReal);

		
	}

}
