package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class MainProba {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime unha palabra");
            String palabras = sc.nextLine();
            OutputStream fos = new FileOutputStream("Probita.txt");

            while (!palabras.equals("fin")) {
                fos.write(palabras.getBytes());
                fos.flush();

                System.out.println("Dime unha palabra");
                palabras = sc.nextLine();

            }

            // String textoProba = "HOla mundito";

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }

        // Ler

        try {
            FileInputStream fis = new FileInputStream("Probita.txt");
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
