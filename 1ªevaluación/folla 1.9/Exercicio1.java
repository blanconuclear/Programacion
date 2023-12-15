/*
 * Programa que mostre un menú como o seguinte:
 * 1. Introducir tres valores enteiros.
 * 2. Mostrar a media
 * 3. Mostrar o produto
 * 4. Mostrar o maior
 * 5. Sair
 * E faga o que indica o menú, cada vez que se preme a tecla correspondente.
 * OLLO: Non poderá facer nada se non se introduciron previamente valores para
 * as variables,
 * pero estas só se introducirán ao premer o a).
 */

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        int max = n1;

        while (!salir) {
            System.out.println(
                    "a) Introducir 3 valores enteiros.\nb) Mostrar a media.\nc) Mostrar o producto.\nd) Mostrar o maior.\ne) Sair");
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
                    break;

                case "b":
                    int media = (n1 + n2 + n3) / 3;
                    System.out.println(media);
                    break;

                case "c":
                    int producto = n1 * n2 * n3;
                    System.out.println(producto);
                    break;

                case "d":
                    if (n2 > max) {
                        max = n2;
                    }
                    if (n3 > max) {
                        max = n3;
                    }
                    System.out.println(max);
                    break;

                case "e":
                    System.out.println("Ata logo");
                    salir = true;
            }
        }
        sc.close();
    }
}