//Programa que pida 10 palabras e as repita. 

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Dime unha palabra:");
            String palabra = sc.nextLine();
            System.out.println("A tua palabra é: " + palabra);
        }
        System.out.println("Ata Logo!");
    }
}