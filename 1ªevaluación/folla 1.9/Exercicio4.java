/*
 * Exercicio que pida a nota obtida nun traballo de 0 a 10, e mostre en función
 * dos seus valores
 * “Suspenso”, “Aprobado”, “Notable” ou “Sobresaliente”
 */

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime a nota que sacaches no examen: ");
        int nota = sc.nextInt();

        if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota <= 6) {
            System.out.println("Aprobado");
        } else if (nota <= 8) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
}