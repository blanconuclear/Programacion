/*Modifica as funcións  introArray( )  e  imprimeArray( ), de xeito que reciban a altura e o
ancho do array. Próbaas cun array de enteiros de 3 x 2 */

/*Modifica as funcións  introArray( )  e  imprimeArray( ), de xeito que reciban a altura e o
ancho do array. Próbaas cun array de enteiros de 3 x 2 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce o número de columnas Horizontais: ");
        int columnasHorizontais = sc.nextInt();
        System.out.println("Introduce o número de columnas verticaias: ");
        int columnasverticais = sc.nextInt();
        int matriz[][] = new int[columnasHorizontais][columnasverticais];

        inicializar(matriz, sc);
        mostrar(matriz);
    }

    public static void inicializar(int[][] matriz, Scanner sc) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Introduce o valor para a posición " + i + " " + j + " : ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}