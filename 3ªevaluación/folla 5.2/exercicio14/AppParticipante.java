package exercicio14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class AppParticipante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Participante[] participantes = new Participante[3];

        for (int i = 0; i < participantes.length; i++) {
            System.out.println("Introduce os datos do participante " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Apelido: ");
            String apelidos = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            participantes[i] = new Participante(nome, apelidos, idade);
        }

        scanner.close();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("participantes.bin"))) {
            oos.writeObject(participantes);
            System.out.println("Participantes gardados correctamente en participantes.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
