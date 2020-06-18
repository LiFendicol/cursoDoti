package aula1;

import java.util.Scanner;

public class case3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		float salario,vendas,salarioPago,comissao;
		
		comissao = 15;
				
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digitar nome:");
		
		nome = ler.next();
		
		System.out.println("Digite salario fixo:");
		
		salario = ler.nextFloat();
		
		System.out.println("Valor em reais de vendas:");
		
		vendas = ler.nextFloat();

		salarioPago = salario+((vendas*comissao)/100);
		
		System.out.println("Nome do vendedor: "+nome);
		System.out.println("Salario fixo: "+salario);
		System.out.println("Salario a ser pago: "+salarioPago);
		
	}

}
