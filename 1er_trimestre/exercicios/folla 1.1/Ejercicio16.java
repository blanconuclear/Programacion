//Pedir un número enteiro por pantalla e mostrar se é par ou impar.

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número: ");
        int n = sc.nextInt();

        if (n%2==0) {
            System.out.println(n + " é par");
        }else{
            System.out.println(n + " é impar");

        }
        sc.close();
    }
}