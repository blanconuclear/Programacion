/*Dada unha cantidade en €, mostrar a súa descomposición máis lóxica en billetes de 50 €, de 10
€, de 5 €, e moedas de 1 €.*/

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidade en €: ");
        int cantidade = sc.nextInt();
        int cincuenta = cantidade/50;
        int diez = cantidade/10;
        int cinco = cantidade/5;
        int uno = cantidade/50;


    
        System.out.println(cantidade+"€"+ " son "+ cincuenta+" billetes de 50€ "+diez+" billetes de 10€ "+ cinco+ " billes de 5€ "+uno+" monedas de 1 " );

    }
}