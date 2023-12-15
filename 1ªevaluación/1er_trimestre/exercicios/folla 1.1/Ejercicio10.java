//Dado un nº de segundos total, mostra cántas horas, minutos e segundos son. Ex: 3700 segs son
//1 hora, 1 minuto e 40 segs.

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Da nº segundos:");
        int tSegundos = sc.nextInt();

        int horas = tSegundos/3600;
        int minutos = ((tSegundos-horas*3600)/60);
        int segundos = tSegundos-(horas*3600+minutos*60);

        System.out.println(horas+" hora "+ minutos+" minutos "+ segundos+" segundos");

    }
}

