/*
 * Escriba unha función que reciba como argumento un número enteiro e devolva o
 * número cos díxitos
 * invertidos. Para o número 12344, devolverá 44321.
 */

public class Exercicio10 {

    public static void main(String[] args) {

        int n1 = 12675;
        int resultado = invertir(n1);

        System.out.println("O número " + n1 + " invertido sería: " + resultado);
    }

    public static int invertir(int a) {
        int invertido = 0, resto;
        while (a > 0) {
            resto = a % 10;
            invertido = invertido * 10 + resto;
            a /= 10;
        }
        return invertido;
    }
}
