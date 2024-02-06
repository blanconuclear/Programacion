import java.util.Scanner;

public class AppDni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DNI[] arrayDni = new DNI[3];

        for (int i = 0; i < arrayDni.length; i++) {
            boolean valido = false;
            while (!valido) {
                try {
                    System.out.print("Introduza o DNI " + (i + 1) + ": ");
                    String input = scanner.nextLine();
                    arrayDni[i] = new DNI(input);
                    valido = true;
                } catch (DNIException e) {
                    System.out.println("DNI incorrecto: " + e.getMessage());
                }
            }
        }

        scanner.close();

        System.out.println("Os arrayDni introducidos son:");
        for (DNI dni : arrayDni) {
            System.out.println(dni.getDNI());
        }
    }
}
