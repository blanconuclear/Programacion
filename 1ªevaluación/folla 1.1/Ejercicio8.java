// Programa que faga o cambio de dólares a €


import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce a tua cantidade en €");
        double euros = sc.nextDouble();
        double conversionDolares = euros / 1.07;
        System.out.println(euros+"€ equivale a "+ conversionDolares + " dolares");


    }
}