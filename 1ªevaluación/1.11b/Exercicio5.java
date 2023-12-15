/*Fai un programa con 3 arrays de 2 dimensión de 2 x 2. Fai varias funcións: 
•Función intro( ) para introducir os 2 primeiros arrays. Tes que chamala 2 veces.
•Función multiplica( ) no que se garde no 3º array o produto de cada elemento da
matriz na terceira matriz.
2    3      2    5      4   15
x    =
2    4      1    2         2    8
•Función imprime( )  no que se impriman os tres arrays coma matrices. Terás que
chamala 3 veces.
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrizA[][] = new int[2][2];
        int matrizB[][] = new int[2][2];
        int matrizC[][] = new int[2][2];

        inicializar(matrizA, matrizB, sc);
        System.out.println();
        mostrar(matrizA, matrizB, matrizC);
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

    public static void mostrar(int[][] matrizA, int[][] matrizB, int[][] matrizC) {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizC[i][j] = matrizA[i][j] * matrizB[i][j];
                System.out.println(matrizC[i][j]);
            }
        }
    }
}