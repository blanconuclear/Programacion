/*Modifica o anterior programa para facer a suma de dous números enteiros (introducidos por teclado
no main( ) ), chamando a unha función que devolve o valor da suma */

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Dmeo segundo número: ");
        int n2 = sc.nextInt();
        int resultado = suma(n1, n2);

        System.out.println(n1 + " + " + n2 + " = " + resultado);

        sc.close();
    }

    public static int suma(int a, int b) {
        return a + b;
    }

}