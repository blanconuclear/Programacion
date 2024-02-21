/*
 * Queremos facer un programa que para calquera ruta introducida, mostre:
 * •se o ficheiro existe ou non
 * •se se trata dun ficheiro ou dun directorio
 * •se é un ficheiro mostrar: nome, tamaño, permisos de lectura e escritura.
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class exercicio5 {
    public static void main(String[] args) throws IOException {

        String nomeFicheiro = JOptionPane.showInputDialog("Dime o nome do ficheiro");
        String rutaFinal = "/home/sanclemente.local/a23efrencv/Descargas";

        Path path = Paths.get(nomeFicheiro);
        Path destino = Paths.get(rutaFinal, nomeFicheiro);

        if (Files.isDirectory(destino)) {
            System.out.println("É un directorio");

        } else {
            if (Files.exists(destino)) {
                System.out.println("É un ficheiro");
                System.out.println("O nome do ficheiro é: " + path.getFileName());
                System.out.println("O tamaño do ficheiro é: " + Files.size(path));

                if (Files.isReadable(path)) {
                    System.out.println("Podes escribir no ficheiro. ");
                } else {
                    System.out.println("Non podes escribir no ficheiro.");
                }
            } else {
                System.out.println("O ficheiro ou directorio NON existe");

            }
        }

    }
}