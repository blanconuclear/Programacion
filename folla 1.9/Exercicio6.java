/*
 * Xogo de adiviñar un número entre 1 e 20. O xogador terá todos os intentos que
 * queira, sendo
 * felicitado ao acertar, indicando cantos intentos lle levou. En cada fallo, o
 * programa lle dirá se o
 * número a adiviñar é maior ou menor que o introducido. Poderá xogar as veces
 * que queira
 */

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nIntentos = 0;
        int nMaquina = (int) (Math.random() * 19 + 1);

        while (true) {
            System.out.println("Introduce un número: ");
            int nXogador = sc.nextInt();
            if (nXogador == nMaquina) {
                System.out.println("Felicidades!");
                break;

            } else {
                if (nXogador < nMaquina) {
                    System.out.println("mayor");
                } else {
                    System.out.println("Menor");
                }
            }
            nIntentos++;
        }

        System.out.println("O número de intentos foi: " + nIntentos);
    }
}