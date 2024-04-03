import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FluxoBytes {
    public static void main(String[] args) {
        String directory = ".";
        String fileName = "sample.txt";
        String absolutePath = directory + File.separator + fileName;

        try (FileOutputStream fileOutputStream = new FileOutputStream(absolutePath)) {
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 2; i++) {
                System.out.println("Dime unha cadea");
                String cadea = sc.nextLine();
                String fileContent = cadea;
                fileOutputStream.write(fileContent.getBytes());
            }
            fileOutputStream.flush();

        } catch (FileNotFoundException e) {
            System.err.println("Ficheiro non encontrado");
        } catch (IOException e) {
            System.err.println("Error na E/S");
        }

        try (FileInputStream fileInputStream = new FileInputStream(absolutePath)) {
            int ch = fileInputStream.read();

            while (ch != -1) {
                System.out.print((char) ch);
                ch = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo non encontrado");
        } catch (IOException e) {
            System.err.println("Erro de E/S");
        }
    }
}
