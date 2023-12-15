package exercicio2;

import java.util.Scanner;

public class AppBombilla {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bombilla bombilla1 = new Bombilla(10);
        Bombilla bombilla2 = new Bombilla(15);
        Bombilla bombilla3 = new Bombilla(6);

        System.out.println("O total da potencía é: " + Bombilla.getPotenciaTotal());

        bombilla1.aumentaPotencia(5);
        bombilla2.aumentaPotencia(50);

        System.out.println("A potencia da bombilla 1 é: " + bombilla1.getPotencia());
        System.out.println("A potencia da bombilla 2 é: " + bombilla2.getPotencia());
        System.out.println("A potencia da bombilla 3 é: " + bombilla3.getPotencia());

        System.out.println("O total da potencía é: " + Bombilla.getPotenciaTotal());

        System.out.println("Watios para baixar a bombilla2: ");
        bombilla2.baixaPotencia(sc.nextInt());
        System.out.println("Watios para baixar a bombilla3: ");
        bombilla3.baixaPotencia(sc.nextInt());

        System.out.println("A potencia da bombilla 1 é: " + bombilla1.getPotencia());
        System.out.println("A potencia da bombilla 2 é: " + bombilla2.getPotencia());
        System.out.println("A potencia da bombilla 3 é: " + bombilla3.getPotencia());

        System.out.println("O total da potencía é: " + Bombilla.getPotenciaTotal());

        bombilla1.setPotencia(0);
        bombilla2.setPotencia(0);
        bombilla3.setPotencia(0);

        System.out.println("A potencia da bombilla 1 é: " + bombilla1.getPotencia());
        System.out.println("A potencia da bombilla 2 é: " + bombilla2.getPotencia());
        System.out.println("A potencia da bombilla 3 é: " + bombilla3.getPotencia());

        System.out.println("O total da potencía é: " + Bombilla.getPotenciaTotal());

        System.out.println("Ata Logo!");

    }
}