//Programa que faga o cambio de ºF a ºC, vendo que a conversión segue a regra
//(3 °F − 32) × 5 / 9 = -16,11 °C

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número:");
        double farenheit = sc.nextDouble();
        double conversion = (farenheit -32)*5/9;
        System.out.println(conversion+"º");
    }
}