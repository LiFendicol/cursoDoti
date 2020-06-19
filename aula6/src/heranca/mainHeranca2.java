package heranca;

import java.util.Scanner;

public class mainHeranca2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String escolha;
		Scanner ler = new Scanner (System.in);
		imovel i = new imovel();
		i.endereco = "Rua";
		i.preco = 3000;
		
		System.out.println("Novo ou Velho: ");
		escolha = ler.next();
		
		if (escolha.equals("Novo")) {
			novo in1 = new novo();
			in1.atualizaValorNovo(1000);
			in1.endereco = i.endereco;
			in1.showImovel();
			in1.showNovo();
		}else {
			velho iv1 = new velho ();
			iv1.atualizaValorNovo(1000);
			iv1.endereco = i.endereco;
			iv1.showImovel();
			iv1.showVelho();
		}
		
		
	}

}
