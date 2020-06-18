package aula3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resultado = " ";
		
		for (int i = 0; i < 40; i++) {
				if (i % 3 ==0) {
					resultado = resultado + String.valueOf(-i)+" ";
				} else {
				resultado = resultado + String.valueOf(i)+" ";
				}
		}
		System.out.println(resultado);
	}

}
