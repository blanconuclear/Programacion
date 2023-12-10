import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        String opcion = "";

        while (!opcion.equals("g")) {
            menu();
            opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                    introducirValores(sc, arr);
                    break;

                case "b":

                    multiplicar(arr);
                    break;

                case "c":
                    calcularMedia(arr);
                    break;

                case "d":

                    intercambioNumero(arr);
                    break;

                case "e":
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i]);
                    }
                    break;

                case "f":

                    almacenarProductoDesdePosicion3a(arr);
                    break;

                case "g":
                    System.out.println("Ata logo!");
                    break;

            }

            sc.nextLine();
        }
    }

    // Función Menú
    public static void menu() {
        System.out.println("a) Introducir os valores.\n" + //
                "b) Multiplicar todos os valores por 3.\n" + //
                "c) Calcular a media dos valores.\n" + //
                "d) Intercambiar os números 2 a 2: o primeiro co segundo, o terceiro co cuarto, e o quinto co sexto.\n"
                + //
                "e) Imprimir o array.\n" + //
                "f) Ir almacenando a partir da posición 3a o produto dos elementos anteriores: na posición 3a o\n" + //
                "produto dos 2 primeiros valores, na posición 4a dos 3 primeiros valores, e así sucesivamente.\n" + //
                "");
    }

    // Función introducir valores.
    public static void introducirValores(Scanner sc, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Dime o nùmero para a posición " + i);
            arr[i] = sc.nextInt();
        }
    }

    // Función multiplicar.
    public static void multiplicar(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 3;
        }
    }

    // Función calcular media.
    public static int calcularMedia(int[] arr) {
        int media = 0;
        for (int i = 0; i < arr.length; i++) {
            media += arr[i];
        }
        return media / arr.length;
    }

    // Función intercambiar números.
    public static void intercambioNumero(int[] arr) {
        int intercambio0 = arr[0];
        arr[0] = arr[1];
        arr[1] = intercambio0;

        int intercambio1 = arr[2];
        arr[2] = arr[3];
        arr[3] = intercambio1;

        int intercambio2 = arr[4];
        arr[4] = arr[5];
        arr[5] = intercambio2;
    }

    public static void almacenarProductoDesdePosicion3a(int[] arr) {
        for (int i = 2; i < arr.length; i += 3) {
            // Calcular el producto de los dos primeros valores
            int producto = arr[i - 2] * arr[i - 1];
            // Almacenar el producto en la posición actual
            arr[i] = producto;
        }
    }
}
