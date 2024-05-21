import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Proba
 */
public class Proba {

    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("proba.bin"))) {
            int numero = 23;
            dos.writeInt(numero);
            dos.writeInt(45);

        } catch (IOException e) {
            e.getMessage();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("proba.bin"))) {
            int n;
            while ((n = dis.readInt()) != -1) {
                System.out.println(n);
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }
}