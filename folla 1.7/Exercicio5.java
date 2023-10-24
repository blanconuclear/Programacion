/*
 * Declara un array a[5] de 5 enteiros. Declara outro array copia[5] de outros 5
 * elementos. Pide os
 * elementos de a[5] por teclado. Fai que todos os elementos do array copia
 * sexan 1. Copia o 1º
 * elemento do array a[] no 1º elemento do array copia[]. Copia o 3º elemento do
 * array a[] no 5º
 * elemento do array copia[]. Mostra o array copia[].
 */

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        // array 1
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Dime o número " + i + " : ");
            array1[i] = sc.nextInt();
        }

        // Array 2
        for (int i = 0; i < 5; i++) {
            array2[i] = 1;
        }

        array2[0] = array1[0];
        array2[4] = array1[2];

        // Imprimo array copia.
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        sc.close();
    }
}