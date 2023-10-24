/*Un traballador cobra 10 €/hora, e as horas extras a 16,50 €/hora. Fai un programa que pida as
horas traballadas nunha semana e mostre os que cobra o traballador. */

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cantas horas traballaches esta semana?");
        int horas = sc.nextInt();

        int horasExtras = 0;

        if (horas > 40) {
            horasExtras = (horas - 40);

        }

        double pagarHorasExtras = horasExtras * 16.5;
        int pagarHoras = 40 * 10;
        double totalSoldo = pagarHorasExtras + pagarHoras;

        System.out.println(
                "Vas a cobrar: " + pagarHoras + "€ polas 40 horas semanais. Mais " + pagarHorasExtras
                        + "€ polas horas extras. Fan un total de: " + totalSoldo + "€");
    }
};