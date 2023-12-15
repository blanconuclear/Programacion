/*
 * Programa que calcule o factorial dun número introducido por teclado. O
 * factorial é o producto do propio
 * número por todos os enteiros menores que el. Ex. Factorial de 5! = 5 * 4 * 3
 * * 2 = 120.
 */

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}