/*Pide unha cadea por teclado. O programa deberá mostrar por pantalla só as 2 primeiras palabras. */

import java.util.Scanner;

public class AppString1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime unha frase: ");
        String cadea = sc.nextLine();

        String[] palabra1 = cadea.split(" ");

        for (int i = 0; i <= 1; i++) {
            System.out.println("A palabra número " + (i + 1) + " é: " + palabra1[i]);
        }
        sc.close();
    }
}
