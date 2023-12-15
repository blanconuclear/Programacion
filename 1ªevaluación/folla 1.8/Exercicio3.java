/*
 * Mostra un menú como o seguinte:
 * a) Introducir un número enteiro
 * b) Mostrar o 25 % do número introducido (será double).
 * c) Mostrar o 35 % do número introducido (será double).
 * d) Mostrar o 50 % do número introducido (será double).
 * e) Sair
 */

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int n = 0;

        while (!salir) {
            System.out.println(
                    "a) Introducir un número enteiro.\nb) Mostrar o 25 % do número introducido (será double).\nc) Mostrar o 35 % do número introducido (será double).\nd) Mostrar o 50 % do número introducido (será double).\ne) Sair");
            System.out.println("elixe unha opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Introduce o número: ");
                    n = sc.nextInt();
                    break;

                case "b":
                    System.out.println(0.25 * n);
                    break;

                case "c":
                    System.out.println(0.35 * n);
                    break;

                case "d":
                    System.out.println(0.50 * n);
                    break;

                case "e":
                    System.out.println("Ata logo");
                    salir = true;
            }
        }
        sc.close();
    }
}