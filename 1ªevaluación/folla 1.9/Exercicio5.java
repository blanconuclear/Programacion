/*
 * Programa que vaia pedindo números polo teclado. Ao final, debe mostrar cantos
 * números
 * introducidos foron negativos, cantos positivos, e a suma total de todos os
 * números. O
 * programa rematará se o número introducido foi o 1111 ou a suma dá 7. O 1111
 * non se contará
 * na suma, pero o 7 si
 */

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nNegativos = (0);
        int nPositivos = 0;

        while (true) {

            System.out.println("Introduce un número: ");
            int n = sc.nextInt();

            if (n == 1111) {
                break;
            }

            if (n == 7) {
                nPositivos += 7;
                break;
            }

            if (n > 0) {

                nPositivos += n;
            } else {
                nNegativos += n;
            }

        }
        System.out.println("O total dos número positivos é: " + nPositivos);
        System.out.println("O total dos número negativos é: " + nNegativos);
        System.out.println(" A suma total é: " + (nNegativos + nPositivos));

    }
}