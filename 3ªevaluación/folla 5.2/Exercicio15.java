import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

// Clase para deserializar y leer objetos de la clase Account desde el archivo
public class Exercicio15 {
    private static ObjectInputStream input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    // abrir archivo
    public static void openFile() {
        try {
            input = new ObjectInputStream(Files.newInputStream(Paths.get("contas.ser")));
        } catch (IOException ioException) {
            System.err.println("Error abriendo el archivo.");
            System.exit(1);
        }
    }

    // método para leer objetos
    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Cuenta",
                "Primer nombre", "Apellidos", "Balance");
        try {
            Account record;
            while ((record = (Account) input.readObject()) != null) { // lectura y casting hasta EOFException
                // mostramos los datos
                System.out.printf("%-10d%-12s%-12s%10.2f%n",
                        record.getAccount(), record.getFirstName(),
                        record.getLastName(), record.getBalance());
            }
        } catch (EOFException endOfFileException) {
            System.out.printf("%nNo hay más datos.%n");
        }
        // Excepción que surge cuando nos llega un objeto que no esperamos
        catch (ClassNotFoundException classNotFoundException) {
            System.err.println("Tipo de objeto inválido.");
        } catch (IOException ioException) {
            System.err.println("Error leyendo el archivo.");
        }
    }

    // método de cierre
    public static void closeFile() {
        try {
            if (input != null)
                input.close();
        } catch (IOException ioException) {
            System.err.println("Error cerrando el archivo.");
            System.exit(1);
        }
    }
}
