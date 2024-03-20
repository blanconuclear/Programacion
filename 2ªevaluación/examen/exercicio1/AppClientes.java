package exercicio1;

import java.util.Scanner;

public class AppClientes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente[] arrCliente = new Cliente[4];

        for (int i = 0; i < arrCliente.length; i++) {

            System.out.println("Dime o nome da cidade: ");
            String cidade = sc.next();
            System.out.println("Dime o número de poboación: ");
            int poboacion = sc.nextInt();
            System.out.println("Dime o nome do cliente: ");
            String nomeCliente = sc.next();

            Cliente cliente = new Cliente(cidade, poboacion, nomeCliente);

            arrCliente[i] = cliente;
        }

        sc.close();

        for (Cliente cliente : arrCliente) {
            System.out.println("O nome da cidade é: " + cliente.getCidade());
            System.out.println("A cantidade de poboación é: " + cliente.getPoboacion());
            System.out.println("O nome do cliente é: " + cliente.getNomeCliente());
        }
    }
}