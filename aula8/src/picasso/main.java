package picasso;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato g1 = new Gato("Gato",4);
		Cachorro c1 = new Cachorro("C�o",4);	
		
		System.out.println(g1.nome);
		c1.som();
		System.out.println(c1.nome);
		g1.som();
		
	}

}
