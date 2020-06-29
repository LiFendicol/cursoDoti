package aula9;

public class exemplo2 {

	public static void main(String[] args) {
	       
        int[] numeros = {4, 6, 8, 16, 64, 128};
        int[] divisor = {2, 0, 4, 8, 0};
       
        for (int i=0; i<numeros.length; i++){
            try{
        System.out.println(numeros[i] + "/" + divisor[i] + " = " + (numeros[i]/divisor[i]));
            }
           
            catch(ArithmeticException e){
                System.out.println("Erro!  não pode dividir por zero");
            }
           
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Posição do array INVALIDA");
            }
        }
       
    }

}
