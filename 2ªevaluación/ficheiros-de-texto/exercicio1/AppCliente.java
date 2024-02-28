package exercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AppCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = """
                a) Gardar clientes.
                b) mostrar clientes.
                c) Sair.
                """;

        String opcion;

        do {
            System.out.println(menu);
            opcion = sc.nextLine();

            switch (opcion) {
                case "a":
                    guardarClientes();
                    break;
                case "b":
                    mostrarClientes();
                    break;
                case "c":
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opción non válida. Inténteo de novo.");
            }
        } while (!opcion.equals("c"));

        sc.close();
    }

    public static void guardarClientes() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(new Cliente("Ana", "Fernández López", 23));
        clientes.add(new Cliente("Antón", "Sueiro Sueiro", 33));
        clientes.add(new Cliente("Xan", "Ferreiro Ferreiro", 77));

        String fichero = "clientes.txt";
        File f = new File(fichero);
        try (FileWriter fw = new FileWriter(f)) {
            PrintWriter escritura = new PrintWriter(fw);
            for (int i = 0; i < clientes.size(); i++) {
                String cadea = clientes.get(i).getNome() + ";" +
                        clientes.get(i).getApelidos() + ";" +
                        clientes.get(i).getIdade();
                escritura.println(cadea);
            }
        } catch (IOException e) {
            System.out.println("Non se pode abrir o ficheiro para escritura");
        }
    }

    public static void mostrarClientes() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        String fichero = "clientes.txt";
        File f = new File(fichero);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String cadea;
            String[] atributos;
            while ((cadea = br.readLine()) != null) {
                atributos = cadea.trim().split(";");
                clientes.add(new Cliente(atributos[0], atributos[1], Integer.parseInt(atributos[2])));

            }
            br.close();

            for (Cliente cliente : clientes) {
                System.out.println(
                        cliente.getNome() + ", " + cliente.getApelidos() + ", " + cliente.getIdade());
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println("Houbo un problema lendo o ficheiro");
        }
    }
}
