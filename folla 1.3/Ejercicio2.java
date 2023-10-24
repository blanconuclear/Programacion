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

        int dado1 = (int) (Math.random() * 9 + 1);
        int dado2 = (int) (Math.random() * 9 + 1);

        Scanner sc = new Scanner(System.in);

        int resultado = 0;

        System.out.println("lanzamento1: ");
        int intento1 = dado1 + dado2;
        resultado += intento1;
        System.out.println(resultado);

        System.out.println("Queres seguir co lanzamento 2?");
        String respuesta1 = sc.nextLine();

        if (respuesta1.equals("y")) {
            System.out.println("Lanzamento2: ");
            int intento2 = dado1 + dado2;
            resultado += intento2;
            System.out.println(resultado);

        } else if (respuesta1.equals("n")) {

            if (resultado == 21) {
                System.out.println("Gañaches " + resultado);
            } else {
                System.out.println("Perdeches " + resultado);
                return;
            }
        }

        System.out.println("Queres seguir co lanzamento 3?");
        String respuesta2 = sc.nextLine();

        if (respuesta2.equals("y")) {
            System.out.println("Lanzamento3: ");
            int intento3 = dado1 + dado2;
            resultado += intento3;
            System.out.println(resultado);
        }
        if (resultado == 21) {
            System.out.println("Gañaches " + resultado);
        } else {
            System.out.println("Perdeches " + resultado);
            return;
        }
    }

}
