package aula3;
import java.util.Scanner;

public class exemplo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		double n1,n2;
		double media = 0;
		String nome;

		Scanner ler = new Scanner(System.in);

		while (media <= 40) {
			//System.out.println("Nome aluno ");
			//nome = ler.next();
			System.out.println("Primeira nota");
			n1 = ler.nextDouble();
			System.out.println("Segunda nota");
			n2 = ler.nextDouble();
			media = media + ((n1 + n2) / 2);
			i++;
		}
		System.out.println(media / i);
	}

}
