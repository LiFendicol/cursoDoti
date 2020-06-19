package heranca;

public class velho extends imovel {
	double precoVelho;
	
	void atualizaValorNovo(double adicional) {
		precoVelho = imovel.preco - adicional;
	}
	
	void showVelho() {
		System.out.println ("Preco de velho: "+precoVelho);
	}

}
