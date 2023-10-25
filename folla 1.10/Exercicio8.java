/*Escribe un programa que, dado un enteiro x, calcule x3+ 2x2+ 3x +1. */

public class Exercicio8 {

    public static void main(String[] args) {

        int n1 = 13;
        double resultado = calculo(n1);

        System.out.println(resultado);
    }

    public static double calculo(int a) {

        return Math.pow(a, 3) + Math.pow(2 * a, 2) + 3 * a + 1;
    }
}