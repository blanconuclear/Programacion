import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercicio111 {
    public static void main(String[] args) {
        int n1 = 123342;
        int n2 = 465543;
        Double media = 23.4;

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("ultimaProba.bin"))) {
            dos.writeInt(n2);
            dos.writeInt(n1);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("ultimaProba.bin"))) {
            int n;
            while ((n = dis.readInt()) != -1) {
                System.out.println(n);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
