/*Programa que pida por teclado un número menor que 10: emprega a función rand(10)
explicada na parte dereita desta folla. O xogador debe ter 3 posibilidades de acerto, indicando se
a súa tentativa foi maior ou menor, e mostrando unha mensaxe efusiva no caso de ter acertado. */

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroAleatorioEnteiro = (int) (Math.random() * 10 + 1);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Dime un número: ");
            int n = sc.nextInt();

            if (n == numeroAleatorioEnteiro) {

                System.out.println("ganaste");
                break;

            } else {
                if (numeroAleatorioEnteiro > n) {
                    System.out.println("Perdiste. El numero es mayor");
                } else {
                    System.out.println("Perdiste. El numero es menor");

                }
            }

        }
        sc.close();

    }
}