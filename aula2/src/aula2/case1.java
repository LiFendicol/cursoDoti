package aula2;

import javax.swing.JOptionPane;

public class case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a,b;
		
		a = JOptionPane.showInputDialog("Digite a");
	
		try {
			Integer.parseInt(a);
		}
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Por favor digite um número. Saindo.");
				System.exit(0);
			}
			catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null,"Por favor digite um número. Saindo.");
				System.exit(0);
		}
		b = JOptionPane.showInputDialog("Digite b");
		
		try {
			Integer.parseInt(b);
		}
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Por favor digite um número. Saindo.");
				System.exit(0);
			}
			catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null,"Por favor digite um número. Saindo.");
				System.exit(0);
		}		

	if (Integer.parseInt(a) == Integer.parseInt(b)) {
		JOptionPane.showMessageDialog(null,"Números são iguais. Saindo.");
	} else {
		if (Integer.parseInt(a) > Integer.parseInt(b)) {
			JOptionPane.showMessageDialog(null,"a maior que b");
		} else {
			JOptionPane.showMessageDialog(null,"b maior que a");
		}
		
	}
		
	
	}

}
