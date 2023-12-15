/* Programa que saúde repetidamente tantas veces como lle digamos por teclado */

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantas veces queres que che saude?: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Hola mundo!");
        }
        sc.close();
    }
}