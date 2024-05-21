import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ProbaBinarios {
    public static void main(String[] args) {
        int n1 = 2343;
        int n2 = 576647;

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("probaNumeros.bin"))) {
            dos.writeInt(n2);
            dos.writeInt(n1);
        } catch (Exception e) {
            // TODO: handle exception
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("probaNumeros.bin"))) {
            int n;

            while ((n = dis.readInt()) != -1) {
                System.out.println(n);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
