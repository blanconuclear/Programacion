//Dados 2 números introducidos por teclado, decidir se algún é divisor do outro.

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce o número 1: ");
        int n1 = sc.nextInt();

        System.out.println("Introduce o número 2: ");
        int n2 = sc.nextInt();

        if (n1 % n2 == 0) {
            System.out.println(n2 + " é divisor de " + n1);
        } else if (n2 % n1 == 0) {
            System.out.println(n1 + " é divisor de " + n2);

        } else {
            System.out.println("Ningún é divisor");

        }
        sc.close();
    }
}