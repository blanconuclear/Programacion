/*
 * Fai un programa que faga a división de 2 números enteiros introducidos por
 * teclado empregando só a
 * operación resta.
 */

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime o número 1: ");
        int n1 = sc.nextInt();

        System.out.println("Dime o número 2: ");
        int n2 = sc.nextInt();

        int resultado = n1;

        for (int i = 1; i < n2; i++) {
            resultado = resultado - n1;
        }
        System.out.println(resultado);
    }
}