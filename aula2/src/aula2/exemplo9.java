package aula2;
import java.util.Scanner;

public class exemplo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String loginUser="Cris";
		String senhaUser="123";
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite seu login: ");
		String login = in.nextLine();
		System.out.println("Digite sua senha: ");
		String senha = in.nextLine();		
	
		if (login.equals(loginUser) && senha.equals(senhaUser)) {
			System.out.printf("Usuário %s logado com sucesso.",login);
		} else {
			System.out.printf("Dados errados");
		}
	
	
	}

}
