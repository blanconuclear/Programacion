/*
 * Dados 3 float introducidos por teclado, ordéaos de maior a menor, sen
 * empregar ningún método
 * predefinido de Java.
 */

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n1: ");
        double n1 = sc.nextDouble();

        System.out.println("n2: ");
        double n2 = sc.nextDouble();

        System.out.println("n3: ");
        double n3 = sc.nextDouble();

        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        }

    }

}
