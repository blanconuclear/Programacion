/*Fai un programa que cambie de € a dólares ( 1 euro son 1.06 dólares) ou de dólares a €
segundo queira o usuario. O programa preguntará que troco quere facer o usuario, farao e
logo preguntará se quere facer outro troco, rematando se o usuario non quere. O resultado
en euros terá 2 decimais. Podes empregar String.format do seguinte xeito:
System.out.println(String.format("Valor: %.2f", numeroDouble )) */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tasaCambio = 1.06; // 1 euro son 1.06 dólares
        boolean continuar = true;

        while (continuar) {
            System.out.println("¿Qué cambio quieres hacer?");
            System.out.println("1. Euros a Dólares");
            System.out.println("2. Dólares a Euros");
            System.out.println("3. Salir");
            System.out.print("Elije una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Introduce la cantidad en euros: ");
                double euros = scanner.nextDouble();
                double dolares = euros * tasaCambio;
                System.out.println(String.format("Resultado: %.2f euros = %.2f dólares", euros, dolares));
            } else if (opcion == 2) {
                System.out.print("Introduce la cantidad en dólares: ");
                double dolares = scanner.nextDouble();
                double euros = dolares / tasaCambio;
                System.out.println(String.format("Resultado: %.2f dólares = %.2f euros", dolares, euros));
            } else if (opcion == 3) {
                continuar = false;
                System.out.println("Saliendo del programa. ¡Hasta luego!");
            } else {
                System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }
        }
        scanner.close();
    }
}
