package contrutores;

public class main {

	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa("John","Smith",25);
		Carro c1 = new Carro ("Uno",2020);
		
		System.out.println(p2.getNome());
		
		System.out.println(c1.ano);
	}

}
