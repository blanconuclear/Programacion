/*Programa que dada unha data de nacemento (pedir día, mes e ano), indique cantos anos ten esa
persoa. Hai que comprobar se xa estivo de aniversario ou non.  */

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        // Data de hoxe
        int dia = 15;
        int mes = 9;
        int ano = 2023;

        // Data de nacemento
        Scanner sc = new Scanner(System.in);
        System.out.println("Día de nacemento: ");
        int diaNacemento = sc.nextInt();
        System.out.println("Mes de nacemento: ");
        int mesNacemento = sc.nextInt();
        System.out.println("Ano de nacemento: ");
        int anoNacemento = sc.nextInt();

        // Calcular a idade
        int calcularIdade = ano - anoNacemento;

        if (diaNacemento < dia && mesNacemento < mes) {
            System.out.println("Xa estivo de aniversario!. Ten " + calcularIdade);
        } else {
            System.out.println("Ainda non estivo de aniversario. Ten " + (calcularIdade - 1));
        }
        sc.close();
    }
}