/*
 * Declara un array de 5 doubles e pídeos por teclado. Escribe na segunda
 * posición o valor de último
 * elemento e mostra de novo todos os valores.
 */

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        double[] arrayEnteiros = new double[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayEnteiros.length; i++) {

            System.out.println("Introduce un valor double:");
            arrayEnteiros[i] = sc.nextDouble();
            System.out.println();
        }

        for (double i : arrayEnteiros) {

            System.out.println(i);
        }

        arrayEnteiros[1] = arrayEnteiros[4];
        System.out.println();

        for (double i : arrayEnteiros) {

            System.out.println(i);
        }
        sc.close();

    }
}