/*
 * Cal sería o código para saber se o indicado no path
 * é un ficheiro? E se é
 * posible escribir no mesmo? 
 * Fai un programa que vaia pedindo o nome dun
 * ficheiro, e mostre se existe e
 * se é posible escribir no mesmo. Faino coa clase File, e coa API NIO.
 */

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Exercicio1
 */
public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime o nome do ficheiro: ");
        String nomeficheiro = sc.nextLine();

        // Feito con File
        File probaConFile = new File(nomeficheiro);
        if (!probaConFile.exists()) {
            System.out.println(nomeficheiro + " NON existe");
        } else {
            System.out.println(nomeficheiro + " existe");

            if (probaConFile.canWrite()) {
                System.out.println("Podes escribir no ficheiro. ");
            } else {
                System.out.println("Non podes escribir no ficheiro.");
            }
        }

        // Feito con NIO
        Path path = Paths.get(nomeficheiro);

        if (Files.exists(path)) {
            System.out.println("O ficheiro existe");

            if (Files.isReadable(path)) {
                System.out.println("Podes escribir no ficheiro. ");
            } else {
                System.out.println("Non podes escribir no ficheiro.");
            }
        } else {
            System.out.println("O ficheiro NON existe");
        }

        sc.close();
    }
}