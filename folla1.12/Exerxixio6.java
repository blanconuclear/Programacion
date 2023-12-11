/*Programa que vaia pedindo números enteiros polo teclado. Ao final, debe mostrar cantos números
introducidos foron menores que 1000, cantos maiores, e a suma total de todos os números. O
programa rematará se o número introducido foi o 2332 ou a suma dá 99. O 2332 non se contará na
suma, pero o 99 si */

import java.util.Scanner;

public class Exerxixio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nMaior1000 = 0;
        int nMenor1000 = 0;
        int sumaTotal = 0;
        int n = 1;

        while (true) {
            System.out.println("Dime un número: ");
            n = sc.nextInt();

            if (n < 1000 && n != 2332) {
                nMenor1000++;
                sumaTotal += n;
            } else if (n > 1000 && n != 2332) {
                nMaior1000++;
                sumaTotal += n;
            }

            if (n == 2332 || sumaTotal == 99) {
                System.out.println("ata logo");
                System.out.println("numeros maior a " + nMaior1000);
                System.out.println("numeros menor a " + nMenor1000);
                System.out.println("Suma total: " + sumaTotal);
                break;
            }

        }
        sc.close();
    }

}
