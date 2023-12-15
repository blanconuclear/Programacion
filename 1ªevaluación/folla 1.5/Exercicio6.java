//Imprime os múltiplos de 7 que hai entre n e m, dous números introducidos por teclado.

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime o primero número: ");
        int n = sc.nextInt();
        System.out.println("Dime o segundo número: ");
        int m = sc.nextInt();
        System.out.println();

        if (n < m) {
            for (int i = n; i < m; i++) {

                if (i % 7 == 0) {

                    System.out.println(i + " é primo de 7");
                }
            }
        } else {
            System.out.println("O número 1 ten que ser menor que o número 2");
        }
    }
}