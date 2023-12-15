/*Define dous arrays a[3][3]   e b[3][3]. Introduce os valores coa función  introArray( ) do
exercicio   anterior.   Intercambia   agora   os   seus   valores   cunha   función  intercambia( ),   e
imprímeos coa función xa feita no exercicio anterior */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrizA[][] = new int[2][2];
        int matrizB[][] = new int[2][2];

        inicializar(matrizA, matrizB, sc);
        intercambiar(matrizA, matrizB);
        mostrar(matrizA, matrizB);
    }

    public static void inicializar(int[][] matrizA, int[][] matrizB, Scanner sc) {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.println("Introduce o valor para a posición " + i + " " + j + " : ");
                matrizA[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                System.out.println("Introduce o valor para a posición " + i + " " + j + " : ");
                matrizB[i][j] = sc.nextInt();
            }
        }
    }

    public static void intercambiar(int[][] matrizA, int[][] matrizB) {
        int intercambio;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                intercambio = matrizA[i][j];
                matrizA[i][j] = matrizB[i][j];
                matrizB[i][j] = intercambio;
            }
        }
    }

    public static void mostrar(int[][] matrizA, int[][] matrizB) {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }
    }
}