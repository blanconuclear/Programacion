/*Fai un programa que pida un String, e diga a posición da primeira ‘a’ da frase */

import java.util.Scanner;

public class AppString1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime unha palabra que conteña a letra: ");
        String palabra = sc.nextLine();
        int posicion = palabra.indexOf("a");

        System.out.println("A posición da primeira 'a' é: " + posicion);

        sc.close();
    }

}
