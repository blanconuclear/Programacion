package miñasProbas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExemploFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nombreCarpeta = "proba";
        String nombreArchivo = "proba.txt";

        File carpeta = new File(nombreCarpeta);

        boolean creado = carpeta.mkdirs();

        if (creado) {
            System.out.println("Carpeta creada con éxito");
        } else {
            System.out.println("A carpeta xa existe.");
        }

        File archivo = new File(nombreCarpeta + '/' + nombreArchivo);
        boolean creadoArchivo = archivo.createNewFile();

        if (creadoArchivo) {
            System.out.println("Archivo creado con éxito");
        } else {
            System.out.println("O archivo xa existe.");
        }

        PrintWriter salida = new PrintWriter(new FileWriter(nombreCarpeta + '/' + nombreArchivo));
        // "true" como segundo argumento de FileWriter indica que el archivo se abrirá
        // en modo de anexar (append)

        String texto;

        do {
            System.out.println("¿Qué quieres escribir? (Escribe 'sair' para salir)");
            texto = sc.nextLine();
            salida.println(texto);

        } while (!texto.equals("sair"));

        salida.close();
        sc.close();

        //
    }
}
