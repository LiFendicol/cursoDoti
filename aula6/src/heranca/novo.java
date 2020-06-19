package heranca;

public class novo extends imovel{
	double precoNovo;
	
	void atualizaValorNovo(double adicional) {
		precoNovo = imovel.preco + adicional;
	}
	
	void showNovo() {
		System.out.println ("Preco de novo: "+precoNovo);
	}
}
