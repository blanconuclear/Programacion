/*
 * Fai un programa que mostre un menú como o seguinte:
 * a) Introducir 4 números enteiros.
 * b) Calcular o máximo e mostralo.
 * c) Calcular o mínimo e mostralo
 * d) Calcular a media e mostrala.
 * e) Sair
 * Nas opcións b), c), e d) debes comprobar que os números foron introducidos
 * polo menos a primeira
 * vez. Emprega unha bandeira para iso
 */

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int max = n1;
        int min = n1 + 1;

        while (!salir) {
            System.out.println(
                    "a) Introducir 4 números enteiros.\nb) Calcular o máximo e mostralo.\nc) Calcular o mínimo e mostralo.\nd) Calcular a media e mostrala..\ne) Sair");
            System.out.println("elixe unha opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Introduce o primeiro número: ");
                    n1 = sc.nextInt();
                    System.out.println("Introduce o segundo número: ");
                    n2 = sc.nextInt();
                    System.out.println("Introduce o terceiro número: ");
                    n3 = sc.nextInt();
                    System.out.println("Introduce o cuarto número: ");
                    n4 = sc.nextInt();
                    break;

                case "b":
                    if (n2 > max) {
                        max = n2;
                    }
                    if (n3 > max) {
                        max = n3;
                    }
                    if (n4 > max) {
                        max = n4;
                    }
                    System.out.println(max);
                    break;

                case "c":
                    if (n2 < min) {
                        min = n2;
                    }
                    if (n3 < min) {
                        min = n3;
                    }
                    if (n4 < min) {
                        min = n4;
                    }
                    System.out.println(min);
                    break;

                case "d":
                    System.out.println((n1 + n2 + n3 + n4) / 4.0);
                case "e":
                    System.out.println("Ata logo");
                    salir = true;
                    break;
            }
        }
        sc.close();
    }
}