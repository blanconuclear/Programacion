/*
 * Programa que pida 10 frases con espazos e as repita. Podes empregar o método
 * contains da clase
 * String, que devolve verdadeiro se a palabra contén un carácter dado.
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Dime unha frase:");
            String frase = sc.nextLine();

            if (frase.contains(" ") == true) {
                System.out.println(" A tua frase ten espacios");
            } else {
                System.out.println(" A tua frase non ten espacios");
            }
        }
        System.out.println("Ata Logo!");
    }
}