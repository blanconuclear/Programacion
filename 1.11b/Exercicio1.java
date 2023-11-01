/*Fai un programa que pida un array de enteiros de dimensións 2 x 2. Fai unha función
introArray( )  que  pida  os  valores,  e  outra  imprimeArray( )  que  os  mostre,   como  una
matriz 2 x 2 */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[2][2];

        introducir(matriz, sc);
        mostrar(matriz);

    }

    public static void introducir(int[][] matriz, Scanner sc) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Introduce o valor para a posición " + i + " " + j + " : ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(matriz[i][j]);
                System.out.println("Na posicón de i: " + i + " e na posición j: " + j + " é " + matriz[i][j]);
            }
        }
    }

}
