/*Programa que pida repetidamente un ano, e mostre se é bisesto ou non. Rematará cando introduza o
3000. Tenta tilizar un único if,con varias condicións */

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano = 0;

        while (ano != 3000) {
            System.out.println("Dime un ano: ");
            ano = sc.nextInt();
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                System.out.println("O ano é bisiesto");
            } else {
                System.out.println("O ano non é bisiesto");
            }
        }
        System.out.println("Ata logo!");
        sc.close();
    }
}