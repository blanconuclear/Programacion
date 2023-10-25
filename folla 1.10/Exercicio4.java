/*
 * Fai un programa que multiplique 4 valores double introducidos por teclado
 * chamando a unha
 * función multiplica4Double.
 */

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime o primeiro número:");
        double n1 = sc.nextDouble();
        System.out.println("Dime o segundo número:");
        double n2 = sc.nextDouble();
        System.out.println("Dime o terceiro número: ");
        double n3 = sc.nextDouble();
        System.out.println("Dime o cuarto número: ");
        double n4 = sc.nextDouble();

        double resultado = multiplica4Double(n1, n2, n3, n4);
        System.out.println(resultado);

        sc.close();

    }

    public static double multiplica4Double(double a, double b, double c, double d) {
        return a * b * c * d;
    }
}