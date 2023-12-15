/*
 * Fai un programa que vaia saudando ao usuario, mentres este diga que si cando
 * preguntamos se quere
 * continuar
 */

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, quieres continuar?: ");
        String resposta = sc.nextLine();

        while (resposta.equals("s")) {
            System.out.println(resposta);
            System.out.println("Hola, seguro que quieres continuar?: ");
            resposta = sc.nextLine();

            if (!resposta.equals("s")) {
                System.out.println("Adios!");
            }
        }
        sc.close();
    }
}