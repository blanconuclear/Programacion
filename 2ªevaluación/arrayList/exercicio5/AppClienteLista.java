package exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * AppClienteLista
 */
public class AppClienteLista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> ListaClientes = new ArrayList<>();

        String menu = """
                +---------------------------------+
                |   Escolle unha opción:          |
                |                                 |
                |   a) Introducir un cliente novo |
                |   b) Mostrar todos os clientes  |
                |   c) Sair                       |
                |                                 |
                +---------------------------------+
                """;

        System.out.println(menu);
        String opcion = sc.nextLine();

        while (!opcion.equals("c")) {

            switch (opcion) {
                case "a":
                    introducirDatos(sc, ListaClientes);
                    break;

                case "b":
                    mostrarDatos(ListaClientes);
                    break;

            }

            System.out.println(menu);
            opcion = sc.nextLine();

        }

        System.out.println("Adeus");
        sc.close();
    }

    public static void introducirDatos(Scanner sc, ArrayList<Cliente> ListaClientes) {
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Teléfono: ");
        int telefono = sc.nextInt();
        sc.nextLine();
        System.out.println("Mail: ");
        String mail = sc.nextLine();
        Cliente clientes = new Cliente(nome, telefono, mail);
        ListaClientes.add(clientes);
    }

    public static void mostrarDatos(ArrayList<Cliente> ListaClientes) {
        for (Cliente cliente : ListaClientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Teléfono: " + cliente.getTelefono());
            System.out.println("Mail: " + cliente.getMail());
            System.out.println();
        }
    }
}
