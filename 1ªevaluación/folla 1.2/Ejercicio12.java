/*
 * Programa que pregunte que hora é, e responda con 'Bos días!', 'Boas tardes!'
 * ou 'Boas noites!'
 */

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que hora é en formato 24h:?");
        int hora = sc.nextInt();

        if (hora > 7 && hora <= 13) {
            System.out.println("Bos días!");
        } else if (hora > 13 && hora <= 20) {
            System.out.println("Boas tardes!");

        } else {
            System.out.println("Boas noites!");

        }
        sc.close();
    }
}
