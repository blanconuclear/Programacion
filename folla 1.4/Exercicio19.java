/* Programa que vaia pedindo números de 4 cifras e os vaia invertindo. */

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        int numero, cifra, nuevoNumero;
        Scanner sc = new Scanner(System.in);

        String resposta = "si";

        nuevoNumero = 0;

        while (resposta.equals("si")) {

            System.out.print("Introduce un número: ");
            numero = sc.nextInt();

            if (numero < 9999) {

                while (numero != 0) {
                    cifra = numero % 10;
                    numero = numero / 10;
                    nuevoNumero = nuevoNumero * 10 + cifra;
                }
            } else {
                System.out.println("O número ten mais de 4 cifras!");
            }
            numero = nuevoNumero;
            System.out.println("Número coas cifras invertidas :" + numero);

            nuevoNumero = 0;

            System.out.println("queres continuar?");
            resposta = sc.next();

        }

    }
}