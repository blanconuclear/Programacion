/*Fai, empregando unha variable menor, o menor de 6 números enteiros. Só con 5 comparacións,
gardando o valor do menor nunha variable chamada menor */

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número 1: ");
        int n1 = sc.nextInt();
        System.out.println("Número 2: ");
        int n2 = sc.nextInt();
        System.out.println("Número 3: ");
        int n3 = sc.nextInt();
        System.out.println("Número 4: ");
        int n4 = sc.nextInt();
        System.out.println("Número 5: ");
        int n5 = sc.nextInt();
        System.out.println("Número 6: ");
        int n6 = sc.nextInt();

        int minimo = n1;

        if (n2 < minimo) {
            minimo = n2;
        } else if (n3 < minimo) {
            minimo = n3;
        } else if (n4 < minimo) {
            minimo = n4;
        } else if (n5 < minimo) {
            minimo = n5;
        } else if (n6 < minimo) {
            minimo = n6;
        }

        System.out.println(minimo);
        sc.close();
    }
}
