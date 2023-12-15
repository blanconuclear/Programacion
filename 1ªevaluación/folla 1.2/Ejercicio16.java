/*Fai un programa que pida por teclado un número de 4 cifras e o mostre invertido. Por exemplo,
dado o número 1234 mostrará o 4321. Vai calculando a cifra de millar, de centena, decena e
unidade. */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa un número de 4 cifras: ");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero >= 1000 && numero < 10000) {
            int cifraUnidad = numero % 10;
            int cifraDecena = (numero / 10) % 10;
            int cifraCentena = (numero / 100) % 10;
            int cifraMillar = numero / 1000;

            int numeroInvertido = cifraUnidad * 1000 + cifraDecena * 100 + cifraCentena * 10 + cifraMillar;

            System.out.println("El número invertido es: " + numeroInvertido);
            System.out.println(cifraUnidad * 1000);
            System.out.println(cifraDecena * 100);
            System.out.println(cifraCentena * 10);
            System.out.println(cifraMillar);
        } else {
            System.out.println("El número no es correcto. Tiene que ser de 4 cifras");
        }

    }
}