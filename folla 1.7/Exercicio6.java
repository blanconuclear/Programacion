/*
 * Declara un array de 3 enteiros. Pídeos por teclado. Escribe na primeira
 * posición o valor gardado na
 * segunda posición, e na segunda posición o gardado na 3ª. Mostra o array.
 * Volve pedir os valores
 * por teclado. Fai o que fixeches antes cun bucle. Mostra de novo o array
 */

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime o número " + i + " : ");
            array[i] = sc.nextInt();
        }

        array[0] = array[1];
        array[1] = array[2];

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime o número " + i + " : ");
            array[i] = sc.nextInt();

        }

        for (int i = 0; i < 2; i++) {
            array[i] = array[i + 1];
        }

        for (int i : array) {
            System.out.println(i);
        }
        sc.close();
    }
}