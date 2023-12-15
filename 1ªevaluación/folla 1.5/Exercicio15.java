/*Programa que pida dous números n e m e mostre os números que hai entre eles indicando se son
pares ou impares co formato que se mostra a continuación. Se introducimos 2 e 5 sairá: 
3.- impar
4.- par */

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime o primeiro número: ");
        int n1 = sc.nextInt() + 1;
        System.out.println("Dime o segundo número: ");
        int n2 = sc.nextInt();

        for (int i = n1; i < n2; i++)
            if (i % 2 == 0) {
                System.out.println(i + ".- par");
            } else {
                System.out.println(i + ".- impar");
            }
    }

}
