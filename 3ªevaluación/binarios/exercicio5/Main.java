package exercicio5;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Quente", "Altus", "Calcetín", 37));
        productos.add(new Producto("TrevincaAltus", "Altus", "Pantalón", 98));
        productos.add(new Producto("Pointer", "Boreal", "Bota", 124));
        productos.add(new Producto("Cares", "Chiruca", "Bota", 113));
        productos.add(new Producto("Ishinca", "Izas", "Pantalón", 83));
        productos.add(new Producto("Expedition", "Lorpen", "Calcetín", 33));
        productos.add(new Producto("FaceFire", "North Face", "Chaqueta", 354));
        productos.add(new Producto("FaceResolve", "North Face", "Chaqueta", 100));
        productos.add(new Producto("Everest", "Trango", "Pantalón", 98));

        final String FILE_NAME = "productos.dat";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(productos);
            System.out.println("Datos de productos guardados en " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Error al guardar los datos de productos: " + e.getMessage());
        }
    }
}
