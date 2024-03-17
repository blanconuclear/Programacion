package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PathExamplo2 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Efrén");
        lista.add("Mati");
        lista.add("Ramis");

        Path ph = Paths.get("nuevaProba.txt");
        try {
            Files.createFile(ph);
            FileWriter fw = new FileWriter(ph.toFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for (String nombre : lista) {
                bw.write(nombre + "\n");
            }

            bw.close();

        } catch (

        IOException e) {
            e.printStackTrace();
        }
    }
}
