/*
 * Programa no que se define un array de 5 enteiros, inicializando todos os
 * valores a 0, e se realizan
 * unha serie de opcións empregando funcións. O programa deberá mostrar o menú
 * 
 * En cada opción farase o seguinte:
 * a) Introdúcese un único valor, xusto despois do último valor distinto de 0
 * b) Fai que todos os elementos do array sexan 0
 * c) Calcula a media e imprímea
 * d) Determina cal é o máximo dos valores e imprímeo.
 * e) Determina cal é o mínimo e móstrao.
 * f) Imprime os cinco elementos do array.
 * g) Sae do programa despedíndose do usuario
 * 
 * Realiza o exercicio empregando funcións. A cada función pasarémoslle o array
 * enteiro desde o
 * main(), imprimindo sempre o resultado que devolve cada función no main(),
 * salvo na opción f)
 * que imprimirá os cinco valores desde a función.
 * O resultado das funcións poderá ser double (por exemplo a media), ou enteiro
 * (o máximo, o
 * mínimo).
 */

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);

        Boolean salir = false;

        while (!salir) {
            System.out.println(
                    "a) Introducir valor.\nb) Borrar todos os valores.\nc) Calcular a media dos valores.\nd) Calcular o máximo dos valores.\ne) Calcular o mínimo dos valores.\nf) Mostrar valores.\ng) Sair.");
            System.out.println("elixe unha opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                    introducir(array, sc);
                    break;
                case "b":
                    borrar(array);
                    break;
                case "c":
                    media(array);
                    break;
                case "d":
                    max(array);
                    break;
                case "e":
                    min(array);
                    break;
                case "f":
                    mostrar(array);
                    break;
                case "g":
                    salir = true;
                    break;
            }

        }
        sc.close();

    }

    public static void introducir(int[] a, Scanner sc1) {

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == 0) {
                System.out.println("Introduce a posición " + i);
                a[i] = sc1.nextInt();
                break;
            }
        }
    }

    public static void borrar(int[] a) {
        a = new int[5];
    }

    public static void mostrar(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("O valor na posición " + i + " é: " + a[i]);
        }
    }

    public static void media(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        System.out.println("A media sería: " + (suma / a.length));
    }

    public static void max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("O número máximo do array é: " + max);
    }

    public static void min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("O númuero mínimo do array é: " + min);
    }

}