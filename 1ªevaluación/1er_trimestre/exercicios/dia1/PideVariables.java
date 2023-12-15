
/*Pido variable por teclado e mostro o seu valor*/

import java.util.Scanner;

public class PideVariables {
    public static void main(String[] args) {
        System.out.println("Introduce un número por teclado");

        Scanner escaner = new Scanner(System.in);   
        int numero = escaner.nextInt();
        System.out.println("O número tecleado é "+ numero );

        int dobleDoNumero = numero *2;
        System.out.println("O doble do número vale "+ dobleDoNumero);
        
    }
    
}