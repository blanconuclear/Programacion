/*Programa que pida 7 números enteiros por teclado e os mostre a continuación na orde na que se
introduciron */

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int[] arrayEnteiros = new int[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayEnteiros.length; i++) {

            System.out.println("Introduce un valor enteiro:");
            arrayEnteiros[i] = sc.nextInt();
            System.out.println();
        }

        for (int i : arrayEnteiros) {

            System.out.println(i);
        }
    }
}