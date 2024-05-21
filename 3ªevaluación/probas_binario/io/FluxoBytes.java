package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FluxoBytes {
    public static void main(String[] args) {
        // Obtemos o directorio home do sistema onde se almacenará o ficheiro
        String directory = ".";
        String fileName = "sample.txt";
        String absolutePath = directory + File.separator + fileName;
        // escritura do ficheiro
        try (FileOutputStream fileOutputStream = new FileOutputStream(absolutePath)) {
            String fileContent = "Texto de proba.";
            // almacenamento de bytes
            fileOutputStream.write(fileContent.getBytes());
            fileOutputStream.flush(); // Forzamos o gardado
        } catch (FileNotFoundException e) {
            System.err.println("Ficheiro non encontrado");
        } catch (IOException e) {
            System.err.println("Error na E/S");
        }
        // lendo o ficheiro
        try (FileInputStream fileInputStream = new FileInputStream(absolutePath)) {
            int ch = fileInputStream.read();
            // ata a fin do stream (ficheiro), imos mostrando letra a letra
            while (ch != -1) {
                System.out.print((char) ch);
                ch = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.err.println("Ficheiro non encontrado");
        } catch (IOException e) {
            System.err.println("Error na E/S");
        }
    }
}