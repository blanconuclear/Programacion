/*Fai un programa para adiviñar un número entre 0 e 100, indicando se falla se o número era maior ou
menor. Conta o número de intentos, e móstrao ao final. Permite ao xogador plantarse se quere. */

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nRamdonMaquina = (int) (Math.random() * 100);
        int intentos = 0;
        String respuesta = "si";

        while (respuesta.equals("si")) {
            System.out.println("Di un número entre 0 e 100: ");
            int nXogador = sc.nextInt();

            if (nRamdonMaquina == nXogador) {
                System.out.println("Gañaches! o teu número: " + nXogador + " é inferior o da máquina. Ela quitou: "
                        + nRamdonMaquina);
            } else {
                if (nXogador < nRamdonMaquina) {
                    System.out.println(
                            "o teu número: " + nXogador + " é inferior o da máquina. Ela quitou: " + nRamdonMaquina);
                } else {
                    System.out.println(
                            "o teu número: " + nXogador + " é superior o da máquina. Ela quitou: " + nRamdonMaquina);
                }
            }

            System.out.println("Queres continuar?: (si/no) ");
            respuesta = sc.next();
            nRamdonMaquina = (int) (Math.random() * 100);
            intentos++;
        }
        System.out.println("O teu número de intentos foi: " + intentos);

        sc.close();
    }
}
