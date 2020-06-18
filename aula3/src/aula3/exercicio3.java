package aula3;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media = 0;
		double total = 0;
		int j = 0;
		
		for (int i = 10; i <= 100; i++) {
			total = total + i;
			j++;
		}
		media = total / j;
		System.out.println(media);
		
	}

}
