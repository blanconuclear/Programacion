/*
 * Programa que vaia pedindo números repetidamente e mostra o máximo dos seus
 * divisores
 * distintos del mesmo, e indique tamén se o número inicial é primo. Remata
 * cando o número
 * introducido é o 0, ou cando o máximo dos divisores foi o 5
 */
//de 2 a la mitad del número 

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Introduce un número: ");
            int n = sc.nextInt();

            int max = 1;
            boolean primo = true;

            if (n == 0) {
                break;
            }

            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    max = i;
                    primo = false;
                }
            }
            System.out.println(max);
        }
    }
}