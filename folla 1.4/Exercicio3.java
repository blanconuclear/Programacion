/*Fai un programa que pida repetidamente dous números e faga a división sempre que o divisor non sexa
0. Rematará cando un dos dous números sexa 100. */

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("n1: ");
        double n1 = sc.nextDouble();

        System.out.println("n2: ");
        double n2 = sc.nextDouble();

        while (n1 != 100 && n2 != 100) {
            if (n2 != 0) {
                System.out.println(n1 / n2);
            } else {
                System.out.println("non se pode dividir entre 0 ");

            }
            System.out.println("n1: ");
            n1 = sc.nextDouble();

            System.out.println("n2: ");
            n2 = sc.nextDouble();
        }

    }
}