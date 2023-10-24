/*
 * Declara un array de 10 enteiros. Fai un menú para facer o seguinte:
 * a) Introducir os 10 números.
 * b) Mostrar os 10 números.
 * c) Poñer a 0 os 3 primeiros elementos do array.
 * d) Poñer a 10 os 3 últimos elementos do array.
 * e) Sair
 */

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println(
                    "a) Introducir os 10 números.\nb) Mostrar os 10 números.\nc) Poñer a 0 os 3 primeiros elementos do array.\nd) Poñer a 10 os 3 últimos elementos do array.\ne) Sair");
            System.out.println("elixe unha opción: ");
            String opcion = sc.nextLine();

            if (opcion.equals("a")) {
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Introduce o número " + (i + 1) + " : ");
                    array[i] = sc.nextInt();
                }
            } else if (opcion.equals("b")) {
                for (int i : array) {
                    System.out.println(i);
                }
            } else if (opcion.equals("c")) {
                for (int i = 0; i <= 2; i++) {
                    array[i] = 0;
                }
            } else if (opcion.equals("d")) {
                for (int i = 7; i <= 9; i++) {
                    array[i] = 10;
                }
            } else if (opcion.equals("e")) {
                System.out.println("Ata logo!");
                salir = true;
            } else {
                System.out.println("O Caracter intruducido non é correcto. Intentao con outro: ");
            }
        }
        sc.close();
    }

}
