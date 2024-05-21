package exercicio5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import exercicio2.Tema;

/* O programa debe empregar un ArrayList para xestionar os produtos, e facer copia desde o ArrayList sempre no
ficheiro produtos.dat. Cada vez que o ArrayList teña un elemento novo debemos facer copia no ficheiro (o ficheiro
sempre ten o mesmo que o arrayList). No inicio do programa deberá comprobar se existe o ficheiro, e se existe lelo
para ter eses produtos no ArrayList. A xestión de produtos farase cun menú :
• ver todos os produtos
• introducir un produto novo
• saír */
public class AppProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = """
                1. ver todos os produtos
                2. introducir un produto novo
                3. saír
                    """;

        String opcionMenu = "";
        final String FILE_NAME = "productos.dat";
        File file = new File(FILE_NAME);
        ArrayList<Producto> productos = new ArrayList<>();

        System.out.println(menu);

        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                productos = (ArrayList<Producto>) ois.readObject();
                for (Producto producto : productos) {
                    System.out.println(producto);
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {

                e.printStackTrace();
            }
        } else {
            System.out.println("Non hai productos");
        }

        while (!opcionMenu.equals("3")) {
            System.out.println("Dime unha opción: ");
            opcionMenu = sc.nextLine();

            switch (opcionMenu) {
                case "1":
                    for (Producto producto : productos) {
                        System.out.println(producto);
                    }
                    break;

                case "2":

                    System.out.println("Dime nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Dime marca: ");
                    String marca = sc.nextLine();
                    System.out.println("Dime tipo: ");
                    String tipo = sc.nextLine();
                    System.out.println("Dime prezo: ");
                    Double prezo = sc.nextDouble();

                    productos.add(new Producto(nome, marca, tipo, prezo));

                    try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                        ois.writeObject(ois);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }

                default:
                    break;
            }
            System.out.println(menu);
        }
    }
}
