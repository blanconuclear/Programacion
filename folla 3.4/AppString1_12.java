/*
 * Fai un programa que vaia pedindo cadeas e mostre 2 veces todas as que teñan
 * algunha 'a', as outras
 * unha vez. Cando vaian 3 frases seguidas con algunha 'a' acabará o programa.
0 */

import java.util.Scanner;

public class AppString1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadea;
        int contadorCadea = 0;

        while (contadorCadea < 3) {
            System.out.println("Dime unha frase: ");
            cadea = sc.nextLine();

            if (cadea.contains("a")) {
                System.out.println("A cadea: " + cadea + " contén a letra 'a'.");
                contadorCadea++;
            } else {
                System.out.println("A cadea: " + cadea + " non contén a letra 'a'.");
                contadorCadea = 0;
            }
        }
        sc.close();
    }
}