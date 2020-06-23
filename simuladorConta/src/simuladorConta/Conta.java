package simuladorConta;

import java.util.Scanner;

public class Conta implements OperacoesBancarias {
	// Definição de conta. So usando interface OperacoesBancarias para usar interface.

	private int codConta;
	private int agencia;
	private String cpf;
	private double saldo;
	private int qtdeRetiradas = 0;
	Scanner ler = new Scanner(System.in);

	//acho que criei a toa esse aqui, é mais para query de SQL...
	boolean verificaCliente(String clienteCPF) {
		if (cpf.equals(clienteCPF)){
			return true;
		}else {
			return false;
		}
	}
	
	//Bem simples, adiciona valor ao saldo
	public void adicionaSaldo(double deposito) {
		this.saldo = getSaldo() + deposito;
		System.out.println("Saldo em conta: "+getSaldo());
	}
	
	//Remove valor, mostra novo saldo, e quantidade de retiradas
	public void removeSaldo(double retirar, Cliente c1) {
		if (temSaldopararetirar(retirar)) {
			this.saldo = this.saldo - retirar;
			setQtdeRetiradas(qtdeRetiradas+1);
			System.out.println("Saldo em conta: "+this.saldo);
			System.out.println("Retiradas do dia: "+this.qtdeRetiradas+". Limite de 3 por dia");
		} else {
			Emprestimo empresta = new Emprestimo();
			if (empresta.temEmprestimo(this.saldo, retirar, c1.getSalario())){
					if (empresta.ofereceEmprestimo(c1.getSalario())) {
						this.saldo = this.saldo + empresta.calcEmprestimo(c1.getSalario());
						System.out.println("Emprestimo de "+empresta.calcEmprestimo(c1.getSalario())+" aplicado.");
						System.out.println("Emprestimo contratado.");
						System.out.println("Novo saldo em conta: "+this.saldo);
						this.saldo = this.saldo - retirar;
						System.out.println("Feito retirada de: "+retirar);
						System.out.println("Saldo em conta final: "+this.saldo);
					}else {
						System.out.println("Emprestimo não contratado.");
						System.out.println("Saldo insuficiente");
						System.out.println("Saldo em conta: "+this.saldo);
					}
					
			}else {
				System.out.println("Saldo insuficiente");
				System.out.println("Saldo em conta: "+this.saldo);
			}
			
		}
			
	}

	//Verifica se tem saldo
	boolean temSaldopararetirar(double retirar) {
		if (this.saldo - retirar >= 0 ) {
			return true;
		} else {
			return false;
		}
	}


	public void verSaldo() {
		System.out.println(saldo);
		
	}

	public int getCodConta() {
		return codConta;
	}

	public void setCodConta(int codConta) {
		this.codConta = codConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getQtdeRetiradas() {
		return qtdeRetiradas;
	}

	public void setQtdeRetiradas(int qtdeRetiradas) {
		this.qtdeRetiradas = qtdeRetiradas;
	}
	
	public Conta (int codConta, int agencia, String cpf, double saldo, int qtdeRetiradas) {
	this.codConta = codConta;
	this.agencia = agencia;
	this.cpf = cpf;
	this.saldo = saldo;
	this.qtdeRetiradas = qtdeRetiradas;
	}
}
