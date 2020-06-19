package aula6;

public class Pessoa {
	String nome;
	int idade;
	char sexo;
	String faixa;
	
	void imprimir() {
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(sexo);
		Classificar(idade);
		System.out.println(faixa);
	}
	
	private void Classificar (int idadeAux) {
			if (idadeAux == 0) {
				faixa = "Erro";
				
		} else {
			if (idadeAux <=2) {
				faixa = "Bebe";
			} else {
				if (idade <= 11) {
					faixa = "Criança";
				} else {
					if (idade <=19) {
						faixa = "Adolescente";
					} else {
						if (idade <= 30) {
							faixa = "Jovem";
							
						}else {
							if (idade <= 60) {
								faixa = "Adulto";
								
							} else {
								faixa = "Idoso";
							}
						}
					}
				}
			}
		}
			
		
		
		
	}
	
}
