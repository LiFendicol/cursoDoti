package aula5;

public class testeLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		livros livro1 = new livros();
		livros livro2 = new livros();
		
		livro1.nome = "Java";
		livro1.autor = "Autor";
		livro1.codLivro = 1;
		livro1.descricao = "Teste";
		livro1.ano = "1900";
		livro1.edicao = "1";
		livro1.isbn = "123.123.123";
		livro1.valor = 10;
		
		livro1.exibirCadastro();
		
		livro2.nome = "Corona";
		livro2.autor = "China";
		livro2.codLivro = 2;
		livro2.descricao = "Quarentena";
		livro2.ano = "2020";
		livro2.edicao = "1";
		livro2.isbn = "123.123.123";
		livro2.valor = 0;
		
		livro2.exibirCadastro();
	}

}
