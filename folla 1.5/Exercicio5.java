/*
 * Programa que pida números de 4 cifras e diga se son capicúas ou non. Rematará
 * cando se introduzan
 * 3 números que non son capicúas.
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nReverse = 0;
        int error = 0;

        while (error != 3) {
            System.out.println("Dime un número de 4 cifras: ");
            int n = sc.nextInt();
            int n2 = n;

            if (n >= 1000 && n <= 9999) {
                while (n != 0) {
                    int digit = n % 10;
                    nReverse = nReverse * 10 + digit;
                    n /= 10;
                }

                if (n2 == nReverse) {
                    System.out.println("O número: " + n2 + " é capicua");
                } else {
                    System.out.println("O número: " + n2 + " non é capicua");
                    error++;
                }
            }

            nReverse = 0;
        }
        System.out.println("Sinto. Introduciches 3 veces números que non son capicua");
    }
}