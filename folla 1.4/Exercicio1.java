/*Fai un programa que pida un número e o mostre. Debe repetir isto varias veces ata que se pulse o 100 */

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número ata que acertes: ");
        int n = sc.nextInt();

        while (n != 100) {
            System.out.println(n);
            System.out.println("introduce outro número: ");
            n = sc.nextInt();
        }

        sc.close();
    }
}