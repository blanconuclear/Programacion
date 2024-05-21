
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import exercicio2.Tema;

public class XestorDeTemas {
    public static void main(String[] args) {
        final String FILE_NAME = "temas.dat"; // Nombre del archivo donde se guardarán los temas
        ArrayList<Tema> temas = new ArrayList<>(); // ArrayList para almacenar objetos Tema
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario

        // Cargar temas desde el archivo si existe
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                temas = (ArrayList<Tema>) ois.readObject(); // Leer objetos Tema desde el archivo
                System.out.println("Temas cargados desde " + FILE_NAME);
                for (Tema tema : temas) {
                    System.out.println(tema); // Llamar al método toString() de Tema implícitamente
                }
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error al cargar los temas: " + e.getMessage());
            }
        } else {
            System.out.println("No se encontró el archivo " + FILE_NAME + ". Comenzando con una lista nueva.");
        }

        String opcion; // Variable para almacenar la opción del menú

        // Bucle principal para mostrar el menú y gestionar las opciones
        do {
            System.out.println("\nMenú de Xestión de Temas:");
            System.out.println("1. Ver todos os temas");
            System.out.println("2. Introducir un tema novo");
            System.out.println("3. Gardar os temas no ficheiro");
            System.out.println("4. Eliminar un dos temas");
            System.out.println("5. Saír");
            System.out.print("Elixe unha opción: ");
            opcion = scanner.nextLine(); // Leer la opción seleccionada por el usuario

            switch (opcion) {
                case "1":
                    // Opción 1: Ver todos los temas
                    if (temas.isEmpty()) {
                        System.out.println("Non hai temas para mostrar.");
                    } else {
                        System.out.println("\nLista de temas:");
                        // Iterar sobre los temas y mostrar cada uno
                        for (int i = 0; i < temas.size(); i++) {
                            System.out.println((i + 1) + ". " + temas.get(i));
                        }
                    }
                    break;

                case "2":
                    // Opción 2: Introducir un tema nuevo
                    System.out.print("Introduce o nome do tema: ");
                    String nome = scanner.nextLine(); // Leer nombre del tema
                    System.out.print("Introduce o autor do tema: ");
                    String autor = scanner.nextLine(); // Leer autor del tema
                    System.out.print("Introduce o ano do tema: ");
                    int ano = Integer.parseInt(scanner.nextLine()); // Leer año del tema
                    System.out.print("Introduce o xénero do tema: ");
                    String xenero = scanner.nextLine(); // Leer género del tema

                    // Crear un nuevo objeto Tema con los datos proporcionados y añadirlo al
                    // ArrayList
                    temas.add(new Tema(nome, autor, ano, xenero));
                    System.out.println("Tema engadido correctamente.");
                    break;

                case "3":
                    // Opción 3: Guardar los temas en el archivo
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                        oos.writeObject(temas); // Escribir objetos Tema en el archivo
                        System.out.println("Temas gardados en " + FILE_NAME);
                    } catch (IOException e) {
                        System.err.println("Erro ao gardar os temas: " + e.getMessage());
                    }
                    break;

                case "4":
                    // Opción 4: Eliminar un tema
                    if (temas.isEmpty()) {
                        System.out.println("Non hai temas para eliminar.");
                    } else {
                        System.out.println("\nLista de temas:");
                        // Mostrar todos los temas para que el usuario elija cuál eliminar
                        for (int i = 0; i < temas.size(); i++) {
                            System.out.println((i + 1) + ". " + temas.get(i));
                        }
                        System.out.print("Introduce o número do tema a eliminar: ");
                        int indice = Integer.parseInt(scanner.nextLine()) - 1; // Leer índice del tema a eliminar
                        // Verificar si el índice está dentro del rango válido
                        if (indice >= 0 && indice < temas.size()) {
                            temas.remove(indice); // Eliminar el tema seleccionado
                            System.out.println("Tema eliminado correctamente.");
                        } else {
                            System.out.println("Número de tema non válido.");
                        }
                    }
                    break;

                case "5":
                    // Opción 5: Salir del programa
                    System.out.println("Saíndo do programa...");
                    break;

                default:
                    // Opción no válida: Mostrar mensaje de error
                    System.out.println("Opción non válida. Inténtao de novo.");
            }
        } while (!opcion.equals("5")); // Salir del bucle cuando se elija la opción "5"

        scanner.close(); // Cerrar el scanner al finalizar el programa
    }
}