import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        // Creación del archivo y escritura
        try (FileOutputStream fos = new FileOutputStream("Probita.txt", true)) { // 'true' para agregar al archivo
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime unha palabra");
            String palabras = sc.nextLine();

            while (!palabras.equals("fin")) {
                fos.write((palabras + System.lineSeparator()).getBytes()); // Añadir nueva línea después de cada palabra
                fos.flush();

                System.out.println("Dime unha palabra");
                palabras = sc.nextLine();
            }

            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Lectura del archivo
        try (FileInputStream fis = new FileInputStream("Probita.txt")) {
            int val = fis.read();
            while (val != -1) {
                System.out.print((char) val);
                val = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
