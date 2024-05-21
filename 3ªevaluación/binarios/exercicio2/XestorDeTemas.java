package exercicio2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class XestorDeTemas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        final String FILE_NAME = "temas.dat";
        ArrayList<Tema> temas = new ArrayList<>();
        File file = new File(FILE_NAME);

        // Comprobar si existe o archivo

        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                temas = (ArrayList<Tema>) ois.readObject();
                for (Tema tema : temas) {
                    System.out.println(tema);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {

                e.printStackTrace();
            }
        }

        System.out.println("\nMenú de Xestión de Temas:");
        System.out.println("1. Ver todos os temas");
        System.out.println("2. Introducir un tema novo");
        System.out.println("3. Gardar os temas no ficheiro");
        System.out.println("4. Eliminar un dos temas");
        System.out.println("5. Saír");
        System.out.print("Elixe unha opción: ");

        String opcionMenu = "";

        while (!opcionMenu.equals("fin")) {
            System.out.println("Dime unha opción: ");
            opcionMenu = sc.nextLine();

            switch (opcionMenu) {
                case "1":

                    for (Tema tema : temas) {
                        System.out.println(tema);
                    }

                    break;

                case "2":
                    System.out.print("Introduce o nome do tema: ");
                    String nome = scanner.nextLine(); // Leer nombre del tema
                    System.out.print("Introduce o autor do tema: ");
                    String autor = scanner.nextLine(); // Leer autor del tema
                    System.out.print("Introduce o ano do tema: ");
                    int ano = Integer.parseInt(scanner.nextLine()); // Leer año del tema
                    System.out.print("Introduce o xénero do tema: ");
                    String xenero = scanner.nextLine(); // Leer género del tema

                    temas.add(new Tema(nome, autor, ano, xenero));

                    break;

                case "3":
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                        oos.writeObject(oos);
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case "4":

                    System.out.println("Dime o índice: ");
                    int indice = sc.nextInt();

                    if (indice >= 0 && indice < temas.size()) {
                        temas.remove(indice);

                    }
            }

            System.out.println("\nMenú de Xestión de Temas:");
            System.out.println("1. Ver todos os temas");
            System.out.println("2. Introducir un tema novo");
            System.out.println("3. Gardar os temas no ficheiro");
            System.out.println("4. Eliminar un dos temas");
            System.out.println("5. Saír");
            System.out.print("Elixe unha opción: ");
        }
    }
}