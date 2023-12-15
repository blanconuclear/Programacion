/*. Programa que pida números e mostre se rematan en 0 ou en 5. Ao final deberá indicar o número de
números introducidos. O programa rematará se o número introducido é negativo. */

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        while (true) {
            System.out.println("Dime un número (introduce un número negativo para rematar):");
            int numero = sc.nextInt();

            if (numero < 0) {
                System.out.println("Programa rematado.");
                break;
            }

            contador++;

            if (numero % 10 == 0) {
                System.out.println(numero + " termina 10.");
            } else if (numero % 10 == 5) {
                System.out.println(numero + " termina 5.");
            } else {
                System.out.println(numero + " non remata nin en 5 nin en 10 ");
            }

        }

        System.out.println("Número de números introducidos: " + contador);
        sc.close();
    }
}