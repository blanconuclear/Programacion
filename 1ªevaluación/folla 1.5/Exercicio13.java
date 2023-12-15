/*
 * Programa que pida números e mostre se rematan en 0 ou en 5. Ao final deberá
 * indicar o número de
 * números introducidos. O programa rematará se o número introducido remata en 3
 */

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();

        int ultimoDigito = 0;

        while (ultimoDigito != 3) {
            System.out.println("Introduce un número por pantalla: ");
            int n = sc.nextInt();
            ultimoDigito = n % 10;
            if (ultimoDigito == 0) {
                System.out.println("O número: " + n + " remata en 0");
            } else if (ultimoDigito == 5) {
                System.out.println("O número: " + n + " remata en 5");
            } else if (ultimoDigito == 3) {
                System.out.println("Ata logo!");
                break;
            } else {
                System.out.println("O número: " + n + " non remata nin en 0 nin en 5");
            }
        }

    }
}
