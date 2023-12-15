/*
 * Crea un programa que sume tres números double introducidos por teclado (a
 * introducción dos
 * valores no main), chamando a unha función suma3Double que devolva o valor da
 * suma.
 */

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime o primeiro número:");
        double n1 = sc.nextDouble();
        System.out.println("Dime o segundo número:");
        double n2 = sc.nextDouble();
        System.out.println("Dime o terceiro número: ");
        double n3 = sc.nextDouble();

        double resultado = suma(n1, n2, n3);
        System.out.println(resultado);

        sc.close();

    }

    public static double suma(double a, double b, double c) {
        return a + b + c;
    }
}