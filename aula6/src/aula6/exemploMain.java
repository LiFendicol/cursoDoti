package aula6;

public class exemploMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		exemplo1 res = new exemplo1();
		exemplo2 res2 = new exemplo2();
		
		int resultado;
		
		res.somarVoid(1,2);
		res.subtrairVoid(1,2);
		
		resultado = res2.somar(5, 5);
		
		
		System.out.println("Resultado int: "+resultado);
	}

}
