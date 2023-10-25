/*
 * Escribe un programa que reciba 3 números flotantes e devolva a media dos 3.
 */

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime o primeiro número:");
        double n1 = sc.nextDouble();
        System.out.println("Dime o segundo número:");
        double n2 = sc.nextDouble();
        System.out.println("Dime o terceiro número: ");
        double n3 = sc.nextDouble();

        double resultado = media(n1, n2, n3);
        System.out.println("A media é: " + resultado);

        sc.close();

    }

    public static double media(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }
}