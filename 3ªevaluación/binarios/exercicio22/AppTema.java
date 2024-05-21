package exercicio22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AppTema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String FILE_NAME = "temas.dat";
        File file = new File("temas.dat");
        ArrayList<Tema> temas = new ArrayList<>();

        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                temas = (ArrayList<Tema>) ois.readObject();
                for (Tema tema : temas) {
                    System.out.println(tema);
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        } else {
            System.out.println("O ARCHIVO NON EXISTE");
        }
        System.out.println("\nMenú de Xestión de Temas:");
        System.out.println("1. Ver todos os temas");
        System.out.println("2. Introducir un tema novo");
        System.out.println("3. Gardar os temas no ficheiro");
        System.out.println("4. Eliminar un dos temas");
        System.out.println("5. Saír");
        System.out.print("Elixe unha opción: ");

        String opcion = " ";

        while (!opcion.equals("5")) {
            System.out.println("Elixe unha opción: ");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":

                    for (Tema tema : temas) {
                        System.out.println(tema);
                    }
                    break;
                case "2":
                    System.out.print("Introduce o nome do tema: ");
                    String nome = sc.nextLine(); // Leer nombre del tema
                    System.out.print("Introduce o autor do tema: ");
                    String autor = sc.nextLine(); // Leer autor del tema
                    System.out.print("Introduce o ano do tema: ");
                    int ano = Integer.parseInt(sc.nextLine()); // Leer año del tema
                    System.out.print("Introduce o xénero do tema: ");
                    String xenero = sc.nextLine(); // Leer género del tema

                    temas.add(new Tema(nome, autor, ano, xenero));
                    break;

                case "3":
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                        oos.writeObject(oos);
                    } catch (Exception e) {
                        // TODO: handle exception
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
