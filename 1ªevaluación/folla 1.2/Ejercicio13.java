/*
 * Programa que pida 2 números e a operación a realizar entre eles (suma, resta,
 * produto e
 * división) e calcule o resultado de facer esa operación.
 */

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n1: ");
        int n1 = sc.nextInt();

        System.out.println("n2: ");
        int n2 = sc.nextInt();

        System.out.println("simbolo: ");
        String simbolo = sc.next();

        switch (simbolo) {
            case "+":
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
                break;
            case "*":
                System.out.println(n1 * n2);
                break;
            case "/":
                System.out.println(n1 / n2);
                break;

        }
        sc.close();
    }
}
