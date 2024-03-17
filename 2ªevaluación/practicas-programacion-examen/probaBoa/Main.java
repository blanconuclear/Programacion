package probaBoa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            String nome = JOptionPane.showInputDialog("Dime un nome: ");
            lista.add(nome);
        }

        // Crear archivo.
        File fl = new File("UltimaProba.txt");
        try {
            fl.createNewFile();

            // Escribir.
            FileWriter fw = new FileWriter(fl);
            BufferedWriter bw = new BufferedWriter(fw);

            for (String string : lista) {
                bw.write(string);
                bw.newLine();
            }
            bw.close();

            // Leer.
            FileReader fr = new FileReader(fl);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";

            while (linea != null) {
                System.out.println(linea);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
