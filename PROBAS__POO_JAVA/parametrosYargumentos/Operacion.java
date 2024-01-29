package parametrosYargumentos;

import javax.swing.JOptionPane;

public class Operacion {

    int n1;
    int n2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // Métodos

    public int suma(int n1, int n2) {
        return suma = n1 + n2;
    }

    public void resta(int n1, int n2) {
        resta = n1 - n2;
    }

    public void multiplicacion(int n1, int n2) {
        multiplicacion = n1 * n2;
    }

    public void division(int n1, int n2) {
        division = n1 / n2;
    }

    public void mostrarDatos(int n1, int n2) {
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Dime un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Dime otro número: "));

        Operacion op = new Operacion();

        op.suma(n1, n2);
        op.resta(n1, n2);
        op.multiplicacion(n1, n2);
        op.division(n1, n2);
        op.mostrarDatos(n1, n2);

    }
}
