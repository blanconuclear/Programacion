/* Programa que devolva o maior de 3 números enteiros */

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Dmeo segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Dime o terceiro número: ");
        int n3 = sc.nextInt();
        int resultado = maximo(n1, n2, n3);

        System.out.println(resultado);

        sc.close();
    }

    public static int maximo(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
            return max;
        } else if (c > max) {
            max = c;
            return max;
        } else {
            return a;
        }

    }
}
