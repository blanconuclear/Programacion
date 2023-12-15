/*O programa repetirá o exercicio anterior, pedindo outro(s) número(s). Rematará cando o número
introducido sexa 0. */

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Dime un número (introduce 0 para rematar):");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("Programa rematado.");
                break;
            }

            if (n > 0 && n < 20) {
                for (int multiplo = 0; multiplo <= 10; multiplo++) {
                    System.out.println(n + " X " + multiplo + " = " + (n * multiplo));
                }
            } else {
                System.out.println("Non é un número enteiro positivo menor que 20.");
            }
        }

        sc.close();
    }
}
