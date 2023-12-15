import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
System.out.println("Introduce o radio do teu circulo");
Scanner escaner = new Scanner(System.in);
int radio = escaner.nextInt();
System.out.println("A area da circunferencia é " +  Math.pow(radio, 2)*3.14);

escaner.close();
}
}