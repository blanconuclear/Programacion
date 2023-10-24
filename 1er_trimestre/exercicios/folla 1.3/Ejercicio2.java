/*
 * Simula o xogo de lanzar 2 dados, dandolle ao xogador 3 intentos como máximo
 * para achegarse ao 21.
 * Se chega xusto felicítao, e se non indicalle que perdeu. O xogador pode
 * plantarse en calquer intento
 * anterior ao terceiro.
 */

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        int numeroAleatorioEnteiro = (int) (Math.random() * 6 + 1);

        Scanner sc = new Scanner(System.in);

        System.out.println("lanzamento1: ");
        System.out.println(numeroAleatorioEnteiro);
        int intento1 = sc.nextInt();

        System.out.println(intento1);

    }
}