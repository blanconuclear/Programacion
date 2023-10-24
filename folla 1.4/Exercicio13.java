/*Calcula o número de cifras que ten un enteiro introducido por teclado, empregando un bucle que vaia
dividindo por 10. */

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número enteiro: ");
        long n = sc.nextLong();
        int contador = 0;

        while (n != 0) {
            n = n / 10;
            contador++;
        }

        System.out.println(contador);
    }

}
