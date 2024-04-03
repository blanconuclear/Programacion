import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FluxoBytesNIO {
    public static void main(String[] args) {
        String directory = ".";
        String fileName = "sample.txt";
        Path path = Paths.get(directory, fileName);
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        System.out.println("Dime unha cadea (escribe 'fin' para rematar): ");
        String cadea = sc.nextLine();

        while (!cadea.equals("fin")) {
            strings.add(cadea);
            System.out.println("Dime unha cadea (escribe 'fin' para rematar): ");
            cadea = sc.nextLine();
        }

        sc.close();

        try {

            Files.write(path, strings, StandardOpenOption.CREATE);
            System.out.println("Strings gardados con éxito.");
        } catch (IOException e) {
            System.err.println("Error na E/S");
        }

        try {

            List<String> data = Files.readAllLines(path);
            System.out.println("Contido do arquivo:");
            for (String line : data) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error na E/S");
        }
    }
}
