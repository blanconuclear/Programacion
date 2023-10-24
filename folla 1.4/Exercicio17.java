/*
 * . Fai un programa que faga o producto de 2 números enteiros introducidos por
 * teclado empregando só a
 * operación suma.
 */

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Introduce o segundo número: ");
        int n2 = sc.nextInt();

        int resultado = n1;

        for (int i = 1; i < n2; i++) {

            resultado = resultado + n1;

        }
        System.out.println(resultado);
    }
}