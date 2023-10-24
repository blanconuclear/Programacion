
// Fai un programa que sume 3 números introducidos por teclado.

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Introduce o primeiro número: ");
        int n1=sc.nextInt();
        System.out.println("Introduce o segundo número: ");
        int n2=sc.nextInt();
        System.out.println("Introduce o terceiro número: ");
        int n3=sc.nextInt();
        int sum = n1+n2+n3;
        System.out.println("0 resultado da suma é: "+ sum);

        sc.close();
    }
}