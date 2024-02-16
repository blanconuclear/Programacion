/*
 * . Fai un programa que pida o nome dun ficheiro con JOptionPane, e se existe o
 * copie nunha carpeta
 * “copia”. Execútao varias veces e comproba que funciona.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

/**
 * Exercicio2
 */
public class Exercicio2 {

    public static void main(String[] args) throws IOException {
        String nomeFicheiro = JOptionPane.showInputDialog("Dime o nome do ficheiro");
        String rutaFinal = "/home/sanclemente.local/a23efrencv/Descargas";

        Path path = Paths.get(nomeFicheiro);

        if (Files.exists(path)) {
            System.out.println("O ficheiro existe");

            Files.copy(path, null);

        } else {
            System.out.println("O ficheiro NON existe");
        }

    }
}