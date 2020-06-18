package aula3;
import java.util.Scanner;

public class exemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 1;
		int mult;
		int res;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite número");
		mult = ler.nextInt();
		
		while (cont <=10 ) {
			res = cont * mult;
			System.out.println(res);
			cont++;
		}
	}

}
