import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new FileReader("./proba.txt"));
        String linea;
        while ((linea = bf.readLine()) != null) {
            System.out.println(linea);
        }

        bf.close();

    }
}
