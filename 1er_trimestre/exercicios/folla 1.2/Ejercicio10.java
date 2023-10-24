/*
 * Programa que pida un ano, e diga se é bisesto. Os anos bisestos son aqueles
 * que son múltiplos
 * de 4. EXCEPTO: Os múltiplos de 100 non son bisestos a non ser que sexan
 * múltiplos de 400.
 * Por exemplo, 1900 non foi bisesto pero o 2000 si.
 */

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un ano:");
        int ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("O ano é bisiesto!");
        } else {
            System.out.println("Non é bisiesto");
        }
        sc.close();
    }

}