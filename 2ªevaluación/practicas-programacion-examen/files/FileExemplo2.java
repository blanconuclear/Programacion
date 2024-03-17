package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileExemplo2 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("efren");
        lista.add("JOse");
        lista.add("Julio");

        File fl = new File("pruebaaaaa.txt");

        try {
            fl.createNewFile();

            FileWriter fw = new FileWriter(fl);
            BufferedWriter bw = new BufferedWriter(fw);

            for (String string : lista) {
                bw.write(string);
                bw.newLine();
            }

            bw.close();

            FileReader fr = new FileReader(fl);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
