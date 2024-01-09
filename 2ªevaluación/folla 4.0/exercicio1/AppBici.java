package exercicio1;

import java.util.Scanner;

public class AppBici {

    public static void main(String[] args) {

        BiciElect biciElect[] = new BiciElect[4];
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                    a) Introducir unha bicicleta.
                    b) Mostrar todo.
                    c) Cambiar os datos de unha bicicleta.
                    d) Mostrar a bici con máis autonomía.
                    e) Mostrar a bici con menos autonomía.
                    f) Sair

                """);

        String opcion = sc.nextLine();

        while (!opcion.equals("f")) {

            System.out.println("""
                        a) Introducir unha bicicleta.
                        b) Mostrar todo.
                        c) Cambiar os datos de unha bicicleta.
                        d) Mostrar a bici con máis autonomía.
                        e) Mostrar a bici con menos autonomía.
                        f) Sair

                    """);

            switch (opcion) {

                case "a":

                    if (BiciElect.getNumBicis() < 5) {

                        System.out.println("Dime o nome da bici");
                        String nomeBici = sc.nextLine();

                        System.out.println("Dime a marca da bici");
                        String marcaBici = sc.nextLine();

                        System.out.println("Km da bici");
                        int kmBici = sc.nextInt();

                        biciElect[BiciElect.getNumBicis()] = new BiciElect(nomeBici, marcaBici, kmBici);
                    }

                    break;

                case "b":
                    for (int i = 0; i < BiciElect.getNumBicis(); i++) {
                        System.out.println("O nome é:" + biciElect[i].getNome());
                        System.out.println("A marca é: " + biciElect[i].getMarca());
                        System.out.println("Os km son:" + biciElect[i].getAutonomiaKms());
                        System.out.println("");
                    }

                    break;

                case "c":

                    System.out.println("que posición queres cambiar:");
                    int posicion = sc.nextInt();

                    System.out.println("Dime o novo nome:");
                    String novoNome = sc.nextLine();
                    biciElect[posicion].setNome(novoNome);

                case "d":

                case "f":
                    System.out.println("Adios");

                    break;

            }

            opcion = sc.nextLine();
        }

    }
}