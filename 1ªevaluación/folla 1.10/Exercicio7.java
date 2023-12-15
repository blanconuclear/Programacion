/* Escribe un programa que devolve o máximo de dous enteiros. */

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Dmeo segundo número: ");
        int n2 = sc.nextInt();
        int resultado = maximo(n1, n2);

        System.out.println("O máximo de " + n1 + " e " + n2 + " é: " + resultado);

        sc.close();
    }

    public static int maximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}