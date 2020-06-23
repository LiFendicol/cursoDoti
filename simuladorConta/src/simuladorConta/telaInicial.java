package simuladorConta;

public class telaInicial {

	public static void main(String[] args) {
		//menu inicial para cliente
		Menu telaUser = new Menu();

		// Não sei se vai dar tempo de montar um DB
		Cliente[] cliente = new Cliente[10];
		cliente[0] = new Cliente("John Smith","12312312312",5000,1234); 
		cliente[1] = new Cliente("Lisa Trish","45645645645",7000,5678); 
		
		Conta conta1 = new Conta(1111,12121,"12312312312",3000,0); 
		Conta conta2 = new Conta(2222,34343,"45645645645",1000,0); 
		// Fim de exemplos de clientes

		//Adicionar um gerente, mas nem sei se vou usar
		Gerente gerente1 = new Gerente("Lex Luthor",0000);
		
		//Teoricamente a main, só vai rodar isso aqui.... Daqui para frente é uma salada de classe chamando classe.....
		telaUser.pedeDados(cliente[0]);
			
		while (!telaUser.getSair()) {
			telaUser.telaInicial(cliente[0], conta1);
		}
	}
}