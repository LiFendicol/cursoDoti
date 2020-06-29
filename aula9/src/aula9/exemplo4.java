package aula9;

import java.util.Scanner;
import java.util.InputMismatchException;

public class exemplo4 {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        try{
           
            System.out.print("Digite a idade:");
            int idade = ler.nextInt();
            System.out.println(idade);
           
        }
       
        catch (InputMismatchException e){
           
            System.out.println(" So pode ser numeros");
            e.getMessage();
           
        }
       
    }
}
