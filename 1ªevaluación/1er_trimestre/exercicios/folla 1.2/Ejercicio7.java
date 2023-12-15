//. Fai o mesmo para un bebé nacido neste ano. Deberás mostrar cantos meses e cantos días ten.

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        // Data de hoxe
        int dia = 15;
        int mes = 9;

        Scanner sc = new Scanner(System.in);

        System.out.println("Día de nacemento: ");
        int diaNacemento = sc.nextInt();
        System.out.println("Mes de nacemento: ");
        int mesNacemento = sc.nextInt();

        int solucionMeses = mes - mesNacemento;
        int solucionDias = (dia - diaNacemento) * -1;

        if (solucionMeses > 1 && solucionDias > 1) {
            System.out.println("O bebé ten: " + solucionDias + " días e " + solucionMeses + " meses.");
        } else if (solucionMeses <= 1 && solucionDias <= 1) {
            System.out.println("O bebé ten " + solucionDias + " día e " + solucionMeses + " mes.");
        } else if (solucionDias <= 1) {
            System.out.println("O bebé ten " + solucionDias + " día e " + solucionMeses + " meses.");

        } else {
            System.out.println("O bebé ten " + solucionDias + " días e " + solucionMeses + " mes.");

        }
        sc.close();
    }
}