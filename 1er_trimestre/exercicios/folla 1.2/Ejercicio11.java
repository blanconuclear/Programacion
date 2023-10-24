/* Fai un programa que redondee un número de 4 cifras á centena máis próxima. Exemplo, 2340 a
2300, e 2560 a 2600. Comproba que o número introducido ten 4 cifras. */

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número de 4 cifras: ");
        double n = sc.nextDouble();

        System.out.println(Math.round(n / 100) * 100);
    }
}
