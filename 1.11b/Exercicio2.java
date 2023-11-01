/*Fai un array de enteiros de 4 x 3. Fai unha función  iniciaArray( ) que asigne en cada
posición   o   valor   o   producto   da   súa   fila   pola   súa   columna.   Modifica   a   función
imprimeArray( ) do exercicio anterior para que imprima este array como unha matriz */

public class Exercicio2 {
    public static void main(String[] args) {

        int matriz[][] = new int[4][3];

        inicializar(matriz);
        mostrar(matriz);
    }

    public static void inicializar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
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