package files;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FilesExemplo {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("efren");
        lista.add("jose");
        lista.add("hugo");

        File fl = new File("probitaConFile.txt");
        try {
            fl.createNewFile();

            FileWriter fw = new FileWriter(fl);
            BufferedWriter bw = new BufferedWriter(fw);

            for (String elemento : lista) {
                bw.write(elemento);
                bw.newLine();
            }

            bw.close(); // Cierra el BufferedWriter

            // Ahora, lee el archivo que acabas de escribir
            FileReader fr = new FileReader(fl);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close(); // Cierra el BufferedReader
        } catch (IOException e) {
            e.printStackTrace();
        }

        // CON NIO
        Path ph = Paths.get("probitaConPath.txt");
        try {
            Files.createFile(ph);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
