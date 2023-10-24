/*10. Declara un array de 12 doubles. Fai un menú para facer o seguinte:
a) Introducir os 12 números.
b) Mostrar os 12 números.
c) Pide unha posición e escribe nesa posición o valor 0
d) Pide unha posición e escribe nesa posición o valor introducido por teclado.
e) Intercambia os 2 primeiros valores do array.
f) Intercambia o 3º e o 4º valor do array.
g) Intercambia os valores de array 2 a 2 cun bucle: os 2 primeiros, o 3º co 4º, o 5º co 6º, etc.
h) Sair. */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double[] array = new double[12];
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println(
                    "a) Introducir os 12 números.\nb) Mostrar os 12 números.\nc) Di unha posición. Mostrarase co número 0.\nd) do unha posición do array e escribe o valor que queres introducir nesa posición.\ne) Intercambia os 2 primeiros valores do array.\nf) Intercambia o 3º e o 4º valor do array.\ng) Intercambia os valores de array 2 a 2 cun bucle: os 2 primeiros, o 3º co 4º, o 5º co 6º, etc.\nh) sair.");
            System.out.println("elixe unha opción: ");
            String opcion = sc.nextLine();

            if (opcion.equals("a")) {
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Introduce o número " + (i + 1) + " : ");
                    array[i] = sc.nextDouble();
                }
            } else if (opcion.equals("b")) {
                for (double i : array) {
                    System.out.println(i);
                }
            } else if (opcion.equals("c")) {
                System.out.println("Dime unha posición do array: ");
                int posicion = sc.nextInt() - 1;
                array[posicion] = 5;
            } else if (opcion.equals("d")) {
                System.out.println("Dime unha posición do array: ");
                int posicion = sc.nextInt() - 1;
                System.out.println("Dime un número: ");
                double n = sc.nextDouble();
                array[posicion] = n;
            } else if (opcion.equals("e")) {
                double posicionTemporal = array[0];
                array[0] = array[1];
                array[1] = posicionTemporal;
            } else if (opcion.equals("f")) {
                double posicionTemporal2 = array[2];
                array[2] = array[3];
                array[3] = posicionTemporal2;
            } else if (opcion.equals("g")) {
                for (int i = 0; i < array.length; i++) {
                    array[i] = array[i + 1];
                }
            } else if (opcion.equals("h")) {
                System.out.println("Ata logo!!");
                salir = true;
            } else {
                System.out.println("O Caracter intruducido non é correcto. Intentao con outro: ");
            }
        }
        sc.close();
    }
}
