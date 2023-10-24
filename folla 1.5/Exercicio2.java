/*
 * Programa que simule o lanzamento dun dado. O programa irá lanzando o dado e o
 * xogador tentará
 * atinar cun único intento por cada lanzamento. Rematará cando acerte, e
 * mostrará o número de veces
 * xogadas.
 */

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        // Dado
        double dadoFloat = (Math.random() * 6.0) + 1.0;
        int dadoMaquina = (int) dadoFloat;
        int contador = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Lanza o dado");
        int dadoXogador = sc.nextInt();

        while (true) {
            if (dadoXogador == dadoMaquina) {
                System.out.println("GAÑACHES!. A máquina sacou: " + dadoMaquina + ". E ti quitaches: " + dadoXogador);
                break;
            } else {
                System.out.println("PERDECHES!. A máquina sacou: " + dadoMaquina + ". E ti quitaches: " + dadoXogador);
            }
            System.out.println("Lanza o dado");
            dadoXogador = sc.nextInt();

            dadoFloat = (Math.random() * 6.0) + 1.0;
            dadoMaquina = (int) dadoFloat;

            contador++;
        }
        if (contador == 1) {
            System.out.println("Gañaches en " + contador + " tirada.");
        } else {
            System.out.println("Gañaches en " + contador + " tiradas.");
        }
    }
}