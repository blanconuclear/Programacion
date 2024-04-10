package exercicio1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class AppParticipante {
    private static ObjectOutputStream output;

    public static void main(String[] args) {
        openFile();
        addParticipants();
        closeFile();
    }

    public static void openFile() {
        try {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("participantes.dat")));
        } catch (IOException ioException) {
            System.err.println("Error o abrir o archivo. Saindo.");
            System.exit(1);
        }
    }

    public static void addParticipants() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            try {

                System.out.println("Participante " + (i + 1));
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Apelidos: ");
                String apellidos = sc.nextLine();
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();

                Participante participante = new Participante(nombre, apellidos, edad);

                output.writeObject(participante);

            } catch (IOException ioException) {
                System.err.println("Error o escribir no archivo. Saindo.");
                break;
            }
        }
    }

    public static void closeFile() {
        try {
            if (output != null)
                output.close();
        } catch (IOException ioException) {
            System.err.println("Error o cerrar o archivo. Saindo.");
        }
    }
}
