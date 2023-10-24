/*Programa que invirta un número de 4 cifras introducido por teclado. */

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        int numero, cifra, nuevoNumero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        numero = sc.nextInt();

        nuevoNumero = 0;

        while (numero != 0) {
            cifra = numero % 10;
            numero = numero / 10;
            nuevoNumero = nuevoNumero * 10 + cifra;
        }

        numero = nuevoNumero;

        System.out.println("Número coas cifras invertidas :" + numero);
    }
}