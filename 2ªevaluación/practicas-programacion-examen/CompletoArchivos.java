import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompletoArchivos {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("efren");
        lista.add("Pepe");
        lista.add("Jose");

        // Crear archivo.
        File fl = new File("ULTIMISIMMAAMAMAMA.txt");
        try {
            fl.createNewFile();

            // Escribir archivo.
            FileWriter fw = new FileWriter(fl);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String string : lista) {
                bw.write(string);
                bw.newLine();
            }
            bw.close();

            // Leer archivo.
            FileReader fr = new FileReader(fl);
            BufferedReader br = new BufferedReader(fr);

            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
