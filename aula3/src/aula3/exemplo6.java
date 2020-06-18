package aula3;
import java.util.Scanner;

public class exemplo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double[] n1,n2,media;
		String[] nome;
		int qtde = 3;

		n1 = new double [qtde]; 
		n2 = new double [qtde];
		media = new double [qtde];
		nome = new String [qtde];
		
		Scanner ler = new Scanner(System.in);
			
		for (i = 0; i < qtde; i++ ) {
			System.out.println("Nome aluno "+(i+1));
			nome[i] = ler.next();
			System.out.println("Primeira nota");
			n1[i] = ler.nextDouble();
			System.out.println("Segunda nota");
			n2[i] = ler.nextDouble();
			media[i] = (n1[i] + n2[i]) / 2;
		}
		for (i = 0; i < qtde; i++ ) {
			System.out.println("Nome "+nome[i]+
					" - Nota 1: "+n1[i]+
					" - Nota 2: "+n2[i]);
			System.out.println("Media: "+media[i]);

		}
	}

}
