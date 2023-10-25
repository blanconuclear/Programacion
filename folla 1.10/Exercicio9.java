/* Escribe un programa que dado un número enteiro N, devolva 1+2+3+...+N. */

public class Exercicio9 {

    public static void main(String[] args) {

        int n1 = 123;
        int resultado = bucle(n1);

        System.out.println(resultado);
    }

    public static int bucle(int a) {
        int sum = 0;

        for (int i = 0; i < a; i++) {
            sum += i;
        }

        return sum;
    }
}