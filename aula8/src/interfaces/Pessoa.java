package interfaces;

public abstract class Pessoa {
	private static String nome;

		public static String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
	}
