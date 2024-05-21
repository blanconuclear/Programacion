package exercicio11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Double tempMin = 11.3;
        Double tempMax = 20.4;

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("ProbaTarde.bin"))) {
            dos.writeDouble(tempMax);
            dos.writeDouble(tempMin);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("ProbaTarde.bin"))) {

            /*
             * Double tempMini = dis.readDouble();
             * Double tempMaxi = dis.readDouble();
             * 
             * System.out.println(tempMini);
             * System.out.println(tempMaxi);
             */
            Double n;
            while ((n = dis.readDouble()) != -1) {
                System.out.println(n);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
