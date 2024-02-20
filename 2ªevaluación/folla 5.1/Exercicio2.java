
/*
 * . Fai un programa que pida o nome dun ficheiro con JOptionPane, e se existe o
 * copie nunha carpeta
 * “copia”. Execútao varias veces e comproba que funciona.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.swing.JOptionPane;

/**
 * Exercicio2
 */
public class Exercicio2 {

    public static void main(String[] args) throws IOException {
        String nomeFicheiro = JOptionPane.showInputDialog("Dime o nome do ficheiro");
        String rutaFinal = "/home/sanclemente.local/a23efrencv/Descargas/copia";

        Path path = Paths.get(nomeFicheiro);
        Path destino = Paths.get(rutaFinal, nomeFicheiro);

        if (Files.exists(path)) {
            System.out.println("O ficheiro existe");

            Files.copy(path, destino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Ficheiro copiado con éxito a: " + destino);

        } else {
            System.out.println("O ficheiro NON existe");
        }

    }
}
