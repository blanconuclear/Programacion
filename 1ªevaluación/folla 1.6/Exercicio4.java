/*Programa que vaia pedindo números con decimais polo teclado. Ao final, debe mostrar
cantos números introducidos foron negativos, cantos positivos, e a suma total de todos os
números. O programa rematará se se teclea o 1000 ou a suma dá 5.50. */

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nNegativos = 0;
        double nPoisitivos = 0;
        double sumaTotal = nNegativos + nPoisitivos;
        double n = 0;

        while (n != 1000 && sumaTotal != 5.50) {

            System.out.println("Dime un número con decimais: ");
            n = sc.nextDouble();
            if (n < 0) {
                nNegativos++;
            } else {
                nPoisitivos++;
            }

        }
        System.out.println(nNegativos);
        System.out.println(nPoisitivos);
        System.out.println(sumaTotal);
    }
}