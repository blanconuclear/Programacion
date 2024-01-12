import java.util.Scanner;

/**
 * Consulta a API da clase Integer, para ver a sintaxe dos métodos
 * toBinaryString(), toOctalString(), e
 * toHexString(), e fai un programa cun menú que permita:
 * a) introducir un enteiro
 * b) mostrar o enteiro en binario
 * c) mostrar o enteiro en octal
 * d) mostrar o enteiro en hexadecimal
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enteiro = 0;

        System.out.println("""
                Seleciona unha opción:

                    a) introducir un enteiro
                    b) mostrar o enteiro en binario
                    c) mostrar o enteiro en octal
                    d) mostrar o enteiro en hexadecimal
                    e) Sair
                        """);

        String opcion = sc.nextLine();

        while (!opcion.equals("e")) {

            System.out.println("""
                    Seleciona unha opción:

                        a) introducir un enteiro
                        b) mostrar o enteiro en binario
                        c) mostrar o enteiro en octal
                        d) mostrar o enteiro en hexadecimal
                        e) Sair
                            """);

            switch (opcion) {
                case "a":
                    System.out.println("Dime un enteiro: ");
                    enteiro = sc.nextInt();
                    break;

                case "b":
                    String cadea = Integer.toBinaryString(enteiro);
                    System.out.println(cadea);
                    break;

                case "c":
                    String cadea1 = Integer.toBinaryString(enteiro);
                    System.out.println(cadea1);
                    break;

                case "d":
                    String cadea2 = Integer.toOctalString(enteiro);
                    System.out.println(cadea2);
                    break;
            }
            opcion = sc.nextLine();
        }

    }
}
