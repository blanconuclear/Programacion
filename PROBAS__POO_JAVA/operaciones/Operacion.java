package operaciones;

import javax.swing.JOptionPane;

/**
 * Coche
 */
public class Operacion {

    int n1;
    int n2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // Metodo

    public void leerNumeros() {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Dime un número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Dime un número: "));
    }

    public void suma() {
        suma = n1 + n2;
    }

    public void resta() {
        resta = n1 - n2;
    }

    public void mostrarDatos() {
        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
    }

    public static void main(String[] args) {
        Operacion op = new Operacion();

        op.leerNumeros();
        op.suma();
        op.resta();
        op.mostrarDatos();

    }

}