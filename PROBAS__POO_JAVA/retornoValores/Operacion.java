package retornoValores;

import java.util.Scanner;

public class Operacion {

    // Métodos

    public int suma(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    public int resta(int n1, int n2) {
        int resta = n1 - n2;
        return resta;
    }

    public int multiplicacion(int n1, int n2) {
        int multiplicacion = n1 * n2;
        return multiplicacion;
    }

    public int division(int n1, int n2) {
        int division = n1 / n2;
        return division;
    }

    public void mostrarDatos(int suma, int resta, int multiplicacion, int division) {
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime n1: ");
        int n1 = sc.nextInt();
        System.out.println("Dime n2: ");
        int n2 = sc.nextInt();

        Operacion op = new Operacion();

        int suma = op.suma(n1, n2);
        int resta = op.resta(n1, n2);
        int multiplicacion = op.multiplicacion(n1, n2);
        int division = op.division(n1, n2);

        op.mostrarDatos(suma, resta, multiplicacion, division);

        sc.close();

    }
}
