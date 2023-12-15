import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        float[] matriz = new float[4];

        introducirValores(matriz);
        mostrarValores(matriz);

    }

    // Función para introducir valores desde o teclado
    public static void introducirValores(float[] matriz) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce 4 valores de matriz:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            matriz[i] = scanner.nextFloat();
        }
    }

    // Función para mostrar os valores da matriz
    public static void mostrarValores(float[] matriz) {
        System.out.println("Valores de la matriz:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Valor " + (i + 1) + ": " + matriz[i]);
        }
    }
}
