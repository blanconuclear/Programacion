package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {

        // Escribir datos
        try {
            String textoProba = "Hola mundo";

            OutputStream fos = new FileOutputStream("proba.txt"); // crea archivo
            fos.write(textoProba.getBytes()); // escribe
            fos.flush(); // asegura contenido
            fos.close(); // cerra
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer datos
        try {
            FileInputStream fis = new FileInputStream("proba.txt");
            int val = fis.read();
            while (val != -1) {
                System.out.print((char) val);
                val = fis.read();
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
