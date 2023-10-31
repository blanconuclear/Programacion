/*Dados 2 arrays de 6 enteiros definidos no main(), introduce os valores para ambos arrays no main().
Define unha función compara que teña como argumentos os dous arrays e devolva 0 se os arrays
son iguais, 1 se o primeiro é maior que o segundo e -1 se o segundo é maior que o primeiro. En
función dese valor recibido no main( ), mostraremos unha mensaxe indicando cal array é maior.
Para decidir cal é maior  iremos comparando valor a valor, ata que algún sexa maior ou menor que
o outro. */

public class Exercicio4 {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4333, 5, 6 };
        int[] array2 = { 1, 2, 3, 4333, 5, 6 };

        int resultado = comparador(array1, array2);
        print(resultado);
    }

    public static int comparador(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        return 0;
    }

    public static void print(int resultado) {
        if (resultado == 0) {
            System.out.println("Os arrays son iguais.");
        } else if (resultado == 1) {
            System.out.println("O array1 é o maior.");
        } else {
            System.out.println("o array2 é o maior.");
        }
    }
}
