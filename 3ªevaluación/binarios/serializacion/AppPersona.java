package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AppPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Andres", 23);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas.dat"))) {
            oos.writeObject(p1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.dat"))) {
            System.out.println(ois.readObject());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
