package simuladorConta;

import java.util.Scanner;

public class Emprestimo {
	//Podia fazer em Conta. Mas ia ficar muito grande aquela classe....
	private double percentual = 0.2;
	
	//Valida se o saldo + emprestimo aprovado cobre a retirada pedida
	boolean temEmprestimo (double saldo, double retirar, double salario, int qtdeEmprestimo) {
		if (qtdeEmprestimo == 0) {
			if (((calcEmprestimo (salario)+saldo) - retirar) >=0) {
				return true;
				} else {
					return false;
				}
			}else {
			return false;
		}
	}
	
	//Retorna valor do emprestimo pre aprovado
	double calcEmprestimo (double salario) {
		return (salario * percentual);
	}
	
	public boolean ofereceEmprestimo (double salario) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Você tem emprestimo aprovado de: "+calcEmprestimo(salario));
		System.out.println("Deseja contratar - S ou N");
		if (ler.next().equals("S")) {
			return true;
		}else{
			return false;
		}
	}
	

}
