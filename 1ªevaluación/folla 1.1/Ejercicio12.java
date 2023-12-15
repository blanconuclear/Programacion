// Fai o intercambio do valor de 2 variables enteiras. Necesitarás unha variable auxiliar.

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("número 1: ");
        int n1 = sc.nextInt();
        System.out.println("número 2: ");
        int n2 = sc.nextInt();
      
        int n3 = n2;
        n2= n1;
        n1 = n3;


        System.out.println(n1 + " "+ n2);

            sc.close();
    }
}