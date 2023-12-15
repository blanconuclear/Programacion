/*
 * Xogo de adiviñar unha palabra entre 5 diferentes que empecen cada unha por
 * unha vogal distinta.
 * O xogador terá 2 intentos para cada unha, sendo felicitado ao acertar, e
 * informado da palabra no
 * caso de fallar. Poderá xogar as veces que queira. Emprega switch
 */

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 0;

        while (intentos != 2) {
            System.out.println(
                    "a) Empeza por a.\nb) Empeza por b.\nc) Empeza por c.\nd) Empeza por d.\ne) Empeza por e.\nf) Sair.");
            System.out.println("elixe unha opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "arbol":
                    if (opcion.equals("arbol")) {
                        System.out.println("felicidades!");
                    } else {
                        System.out.println("fallaches!");
                    }
                    break;

                case "barco":
                    if (opcion.equals("barco")) {
                        System.out.println("felicidades!");
                    } else {
                        System.out.println("fallaches!");
                    }
                    break;

                case "casa":

                    if (opcion.equals("casa")) {
                        System.out.println("felicidades!");
                    } else {
                        System.out.println("fallaches!");
                    }
                    break;

                case "dedo":

                    if (opcion.equals("dedo")) {
                        System.out.println("felicidades!");
                    } else {
                        System.out.println("fallaches!");
                    }
                    break;

                case "elefante":
                    if (opcion.equals("elefante")) {
                        System.out.println("felicidades!");
                    } else {
                        System.out.println("fallaches!");
                    }
                    break;

            }
            intentos++;
        }
        sc.close();
    }
}