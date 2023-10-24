/*Programa que tire unha moeda ao aire tantas veces como queira o xogador, indicando se acerta ou
non. Ao final deberá mostrar cantos acertos houbo e o número de veces xogadas. */

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String seguir = "s";
        int vecesTiradas = 0;
        int vecesGanadas = 0;
        String resultadoMaquina;

        while (seguir.equals("s")) {
            Double numeroAleatorio = Math.random();

            System.out.println("Cara ou cruz?: ");
            String resultadoJugador = sc.next();

            if (numeroAleatorio < 0.5) {
                resultadoMaquina = "cara";

            } else {
                resultadoMaquina = "cruz";
            }

            if (resultadoJugador.equals(resultadoMaquina)) {
                System.out.println(
                        "Gañaches. Ti escolleches " + resultadoJugador + ". E a máquina escolleu " + resultadoMaquina);
                vecesGanadas++;
            } else {
                System.out.println(
                        "Perdeches. Ti escolleches " + resultadoJugador + ". E a máquina escolleu " + resultadoMaquina);
            }

            System.out.println("Queres continuar?(s/n)");
            seguir = sc.next();
            vecesTiradas++;

        }
        System.out.println("Tiraches: " + vecesTiradas + ". E gañaches: " + vecesGanadas);

        sc.close();
    }
}