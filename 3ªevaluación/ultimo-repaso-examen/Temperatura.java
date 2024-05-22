import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

/**
 * Temperatura
 */
public class Temperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Proba.bin"))) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Dime temperatura min: ");
                Double tempMin = sc.nextDouble();
                System.out.println("Dime tempMax: ");
                Double tempMax = sc.nextDouble();
                dos.writeDouble(tempMax);
                dos.writeDouble(tempMin);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("Proba.bin"))) {
            Double n;
            while ((n = dis.readDouble()) != -1) {
                System.out.println(n);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}