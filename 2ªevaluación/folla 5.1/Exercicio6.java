/*
 * Fai un programa que cree nunha carpeta “ficheirosTemporais” ata 5 ficheiros
 * de texto, cada un con
 * unha frase introducida por teclado. Os ficheiros serán “exemplo1.txt”,
 * “exemplo2.txt”, etc.
 */

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nomeCarpeta = "ficheirosTemporais";
        String ruta = "/Users/efrencorzonvazquez/Desktop"; // Teño a ruta comentada, porque senon da error en outros
                                                           // pc(obviamente)

        File carpeta = new File(nomeCarpeta);
        boolean creado = carpeta.mkdirs();

        if (creado) {
            System.out.println("Carpeta creada con éxito");
        } else {
            System.out.println("A carpeta xa existe.");
        }

        System.out.println("Cantos arquivos queres crear?");
        int nArchivos = sc.nextInt();

        if (nArchivos <= 5) {
            for (int i = 0; i < nArchivos; i++) {
                System.out.println("Escribe a frase número " + (i + 1) + ": ");
                String frase = sc.next();
                String rutaArchivo = /* ruta + "/" + */nomeCarpeta + "/exemplo" + (i + 1) + ".txt";
                File archivo = new File(rutaArchivo);
                archivo.createNewFile();
                Files.write(archivo.toPath(), frase.getBytes());
            }
        } else {
            System.out.println("Non se ponden crear mais de 4 arquivos.");
        }

        sc.close();
    }
}
