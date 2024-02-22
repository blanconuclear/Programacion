package miñasProbas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploPath {
    public static void main(String[] args) throws IOException {
        String nombreArchivo = "proba.txt";
        Path ruta = Paths.get("/Users/efrencorzonvazquez/Desktop/" + nombreArchivo);

        if (Files.exists(ruta)) {
            if (Files.isDirectory(ruta)) {
                System.out.println("É un directorio");
                System.out.println("O nome do archivo é: " + ruta.getFileName());
            } else {
                System.out.println("É un archivo");
                System.out.println("O nome do archivo é: " + ruta.getFileName());

                Files.delete(ruta); // No hay necesidad de asignar el resultado a una variable
                System.out.println("Archivo borrado exitosamente");
            }
        } else {
            System.out.println("Non existe");
        }
    }
}
