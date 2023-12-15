/*Fai un programa que mostre a táboa de multiplicar dun número enteiro positivo menor que 20
introducido por teclado. Deberá comprobar que o número é positivo e menor que 20. A saída do
programa deberá ser (se se teclea o 2):
2 x 1 = 2
2 x 2 = 4
 ....
2 x 10 = 20 */

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int n = sc.nextInt();
        int multiplo = 0;

        while (multiplo <= 10) {
            if (n > 0 && n < 20) {
                System.out.println(n + " X " + multiplo + " = " + (n * multiplo));

            } else {
                System.out.println("Non é un número enteiro positivo menor que 20.");
                break;
            }
            multiplo++;
        }
        sc.close();
    }
}
