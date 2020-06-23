package picasso;

public class Cachorro extends animal{

	public void som() {
		System.out.println("Latir");
	}
	
	public Cachorro (String nome, int patas) {
		this.nome = nome;
		this.patas = patas;
	}
}
