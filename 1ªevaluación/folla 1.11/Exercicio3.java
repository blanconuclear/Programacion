/*Programa con funcións, para que, dado un array de 4 elementos enteiros, mostre un menú para:
a) Introducir todos os datos
b) Borrar algún dos elementos. ( O usuario indicará o índice do elemento a borrar, e o
programa desprazará os existentes á dereita do elixido unha posición á esquerda)
c) Imprimir o array 
d) Imprimir o array en xeito inverso
e) Sair
OLLO: Lembra que en Java non se poden eliminar elementos, debes utilizar un valor especial para
controlar no teu programa que ese valor significa nulo. */

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        int[] array = new int[4];
        Scanner sc = new Scanner(System.in);

        Boolean salir = false;

        while (!salir) {
            System.out.println(
                    "a) Introducir todos os datos.\nb) Borrar algún dos elementos.\nc) Imprimir o array .\nd) Imprimir o array en xeito inverso.\ne) Sair.");
            System.out.println("elixe unha opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                    introducir(array, sc);
                    break;
                case "b":
                    borrar(array, sc);
                    break;
                case "c":
                    mostrar(array);
                    break;
                case "d":
                    mostrarInv(array);
                    break;
                case "e":
                    salir = true;
                    break;
            }

        }
        sc.close();

    }

    public static void introducir(int[] a, Scanner sc1) {

        for (int i = 0; i < a.length; i++) {
            System.out.println("Introduce a posición " + i);
            a[i] = sc1.nextInt();
        }
    }

    public static void borrar(int[] a, Scanner sc1) {
        System.out.println("Que posición queres borrar?: ");
        int posicion = sc1.nextInt();

        for (int i = 0 - 1; i < a.length; i++) {
            if (i == posicion) {
                a[i] = 0;
            }
        }
    }

    public static void mostrar(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("O valor na posición " + i + " é: " + a[i]);
        }
    }

    public static void mostrarInv(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println("O valor na posición " + i + " é: " + a[i]);
        }
    }
}