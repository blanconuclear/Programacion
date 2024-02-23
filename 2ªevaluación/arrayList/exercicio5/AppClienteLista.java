package exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * AppClienteLista
 */
public class AppClienteLista {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        String menu = """
                Escolle unha opción:

                    a) Introducir un cliente novo
                    b) Mostrar todos os clientes
                    c) Sair
                    """;

        System.out.println(menu);
        String opcion = sc.nextLine();

        while (!opcion.equals("c")) {

        }

    }
}