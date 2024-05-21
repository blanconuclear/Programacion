import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class EscribirArchivo {
    public static void main(String[] args) {
        int n1 = 34;
        int n2 = 23;

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("probaaaaa.bin"))) {
            dos.writeInt(n1);
            dos.writeInt(n2);
        } catch (Exception e) {
            // TODO: handle exception
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("probaaaaa.bin"))) {
            while (dis.available() > 0) {
                int nu1 = dis.readInt();
                int nu2 = dis.readInt();

                System.out.println(nu1);
                System.out.println(nu2);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
