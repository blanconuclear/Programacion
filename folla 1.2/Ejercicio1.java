//1. Menor de 3 números introducidos por teclado.

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número 1: ");
        int n1 = sc.nextInt();
        System.out.println("Número : ");
        int n2 = sc.nextInt();
        System.out.println("Número 3: ");
        int n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) {
            System.out.println(n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println(n2);
        } else {

            System.out.println(n3);
        }
        sc.close();
    }
}