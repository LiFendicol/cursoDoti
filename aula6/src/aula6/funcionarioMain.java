package aula6;

import java.util.Scanner;

public class funcionarioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario ind = new Funcionario();
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite nome: ");
		ind.nomeFunc = ler.nextLine();
		System.out.println("Salario: ");
		ind.salario = ler.nextDouble();
		ind.situacao = false;
		
		ind.Imprimir();
		ind.AtualizarFuncionario(1.2);
		ind.Imprimir();
		
	}

}
