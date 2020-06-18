package aula2;

import javax.swing.JOptionPane;

public class exemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a, b;
		int res;
		
		a = JOptionPane.showInputDialog("Digite a");
		b = JOptionPane.showInputDialog("Digite b");	
		
		res = Integer.parseInt(a) + Integer.parseInt(b);
		
		//System.out.println(res);
		
		JOptionPane.showMessageDialog(null,res);
		
	}

}
