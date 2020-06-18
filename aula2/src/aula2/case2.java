package aula2;

import javax.swing.JOptionPane;

public class case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double retirada = 0;
		double saldo = 100;
		double salario = 100;
		double emprestimo;
		
		int querEmprestimo;
		
		try {
			retirada = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser retirado:"));
			}
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Por favor digite valor em Real. Saindo.");
				System.exit(0);
			}
			catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null,"Por favor digite valor em Real. Saindo.");
				System.exit(0);
		}
		
		
		if (retirada <= saldo) {
			saldo = saldo - retirada;
			JOptionPane.showMessageDialog(null,"Valor retirado: "+retirada+"\n"+"Restantante em conta: "+saldo);
		} else {
			JOptionPane.showMessageDialog(null,"Saldo insuficiente.\n Saldo em conta: "+saldo);
			emprestimo = salario * 0.5;
			if (retirada <= (saldo + emprestimo)) {
				querEmprestimo = JOptionPane.showConfirmDialog(null,"Você tem um emprestimo pré-aprovado de: "+emprestimo+"\n Deseja contratar?");
					if ( querEmprestimo == 0) {
						saldo = (saldo + emprestimo) - retirada;
						JOptionPane.showMessageDialog(null,"Valor retirado: "+retirada+"\n"+"Restantante em conta: "+saldo);
						
					} else {
						JOptionPane.showMessageDialog(null,"Emprestimo não contratado.\n"+"Saldo insuficiente");
					}
			}
		}
		
	}

}
