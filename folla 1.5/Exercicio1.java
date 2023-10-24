/*Programa que vaia pedindo números e mostre se son pares ou impares. Rematará cando se introduza
o 0. */

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número: ");
        int n = sc.nextInt();

        while (n != 0) {
            if (n % 2 == 0) {
                System.out.println("O número " + n + " é par.");
            } else {
                System.out.println("O número " + n + " é impar.");
            }

            System.out.println("Dime un número(ou pon o 0 para sair...): ");
            n = sc.nextInt();

        }
        System.out.println("Ata logo!");
    }
}