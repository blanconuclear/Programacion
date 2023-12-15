/*
 * Programa que vaia pedindo repetidamente 3 números e os mostre ordeados.
 * Despois de mostralos
 * preguntará se quere continuar, repetindo se o usuario contesta que ‘si’ á
 * pregunta de se quere facelo de
 * novo.
 */

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String seguir = "s";

        while (seguir.equals("s")) {
            System.out.println("Introduce o número 1: ");
            int n1 = sc.nextInt();

            System.out.println("Introduce o número 2: ");
            int n2 = sc.nextInt();

            System.out.println("Introduce o número 3: ");
            int n3 = sc.nextInt();

            if (n1 < n2 && n1 < n2 && n3 > n2) {
                System.out.println(n1 + " " + n2 + " " + n3);
            } else if (n2 < n1 && n2 < n3) {
                System.out.println(n2 + " " + n1 + " " + n3);

            } else if (n3 < n1 && n3 < n2) {
                System.out.println(n3 + " " + n2 + " " + n1);

            } else {
                System.out.println(n3 + " " + n1 + " " + n2);

            }

            System.out.println("queres seguir (s/n): ");
            seguir = sc.next();
        }

        System.out.println("Ata a próxima!");
    }
}