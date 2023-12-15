//Programa que calcule o producto de 3 números e mostre o resultado indicando os números.
//P. ex. se os números son 1, 2 e 3 a mensaxe será:
//1 x 2 x 3 vale 6.

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);

        System.out.println("Introduce o primeiro número: ");
        int n1=sc.nextInt();
        System.out.println("Introduce o segundo número: ");
        int n2=sc.nextInt();
        System.out.println("Introduce o terceiro número: ");
        int n3=sc.nextInt();
        int mult = n1*n2*n3;
        System.out.println("0 resultado da multiplicación de "+ n1+" X "+n2+" X "+n3+" vale "+ mult );


        sc.close();

    }
}