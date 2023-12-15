package exercicio2;

import java.util.Scanner;

/**
 * AppFraseBuilder
 */
public class AppFraseBuilder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FraseBuilder frase = new FraseBuilder();

        while (true) {
            System.out.println("a) iniciaFrase\n" +
                    "b) eliminaFrase\n" +
                    "c) mostraFrase\n" +
                    "d) mostraLonxitudeCapacidade\n" +
                    "e) eliminaParte\n" +
                    "f) introducirDouble\n" +
                    "g) invertirFrase\n" +
                    "h) fin");

            String opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Dime unha frase: ");
                    frase.iniciaFrase(sc.nextLine());
                    break;

                case "b":
                    frase.eliminaFrase();
                    break;

                case "c":
                    frase.mostraFrase();
                    break;

                case "d":
                    frase.mostraLonxitudeCapacidade();
                    break;

                case "e":
                    System.out.println("Dime o primeiro indice: ");
                    int indice1 = sc.nextInt();
                    System.out.println("Dime o seguno indice: ");
                    int indice2 = sc.nextInt();
                    frase.eliminaParte(indice1, indice2);
                    break;

                case "f":
                    System.out.println("Dime posición: ");
                    int poiscion = sc.nextInt();
                    System.out.println("Dime o double: ");
                    Double numeroDoble = sc.nextDouble();
                    frase.introducirDouble(poiscion, numeroDoble);
                    break;

                case "g":
                    frase.invertirFrase();
                    break;

                case "h":
                    System.out.println("Ata logo!");
                    break;

            }

        }
    }

}