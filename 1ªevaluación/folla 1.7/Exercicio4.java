/*
 * Declara un array de 8 enteiros. Pídeos por teclado. Móstraos. Cambia agora o
 * último polo primeiro,
 * e o segundo polo penúltimo. Mostra todos os valores
 */

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        int[] array = new int[8];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime o número " + i + " : ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int posicionTemporal = array[0];
        array[0] = array[7];
        array[7] = posicionTemporal;

        posicionTemporal = array[1];

        array[1] = array[6];
        array[6] = posicionTemporal;

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        sc.close();

    }
}