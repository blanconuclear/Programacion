/*Fai un programa empregando switch no que se mostre o seguinte menú e faga o que se explica a
continuación ao pulsar esa letra:
a) Introducir un double
b) Imprimir o double
c) Sair */

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        double n = 0;

        while (!salir) {
            System.out.println(
                    "a) Introducir un número dobre.\nb) Mostrar o número.\nc) Sair.");
            System.out.println("elixe unha opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Introduce o número: ");
                    n = sc.nextDouble();

                case "b":
                    System.out.println(n);

                case "c":
                    System.out.println("Ata logo");
                    salir = true;
            }
        }
        sc.close();
    }
}