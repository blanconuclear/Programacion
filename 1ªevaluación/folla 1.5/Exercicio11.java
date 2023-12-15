/*
 * Programa que pregunte primeiro: ¿cantos números queres introducir?, pida eses
 * números e calcule a
 * súa suma e o máximo deles.
 */

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantos números queres introducir?: ");
        int n = sc.nextInt();
        int suma = 0;
        int max = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Dime un número: ");
            int nParaSumar = sc.nextInt();
            suma += nParaSumar;

            if (nParaSumar > max) {
                max = nParaSumar;
            }
        }
        System.out.println("a tua suma é:" + suma + ". E o teu número máximo é: " + max);

    }

}