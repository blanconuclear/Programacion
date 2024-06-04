package exercicioRepaso2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/* O programa debe empregar un ArrayList para xestionar os temas (obxectos da clase Tema), e
facer copia desde o ArrayList cando o usuario o requira no ficheiro temas.dat. No inicio do
programa deberá comprobar se existe o ficheiro, e se existe lelo para ter eses temas no
ArrayList.
A xestión de temas farase cun menú :
• Ver todos os temas
• Introducir un tema novo
• Gardar os temas no ficheiro
• Eliminar un dos temas
• Saír */

public class AppTema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = """
                1. Ver todos os temas
                2. Introducir un tema novo
                3. Gardar os temas no ficheiro
                4. Eliminar un dos temas
                5. Saír
                    """;
        ArrayList<Tema> temas = new ArrayList<>();
        final String FILE_NAME = "temas.dat";
        File file = new File(FILE_NAME);

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
        } else {
            System.out.println("El archivo no existe");
        }
        System.out.println(menu);
        String opcionMenu = " ";

        while (!opcionMenu.equals("5")) {
            System.out.println("Dime unha opción: ");
            opcionMenu = sc.nextLine();
            switch (opcionMenu) {
                case "1":
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                        temas = (ArrayList<Tema>) ois.readObject();
                        for (Tema tema : temas) {
                            System.out.println(tema);
                        }
                    } catch (IOException | ClassNotFoundException e) {
                        System.out.println(e.getMessage());
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
                        oos.writeObject(temas);

                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "4":
                    System.out.println("Dime un índice: ");
                    int indice = sc.nextInt();

                    temas.remove(indice);
            }

            System.out.println(menu);
        }
    }
}
