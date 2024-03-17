package exceptions;

import java.util.Scanner;

public class AppPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        Persoa persona = new Persoa(nombre, edad);

        try {
            persona.comprobarIdade();
            System.out.println(persona.getNome());
            System.out.println(persona.getIdade());
        } catch (ExceptionPersonalizada e) {
            System.out.println("Excepción: " + e.toString() + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
