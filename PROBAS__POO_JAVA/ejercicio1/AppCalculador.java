package ejercicio1;

import javax.swing.JOptionPane;

public class AppCalculador {
    public static void main(String[] args) {

        Calculador c1;
        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Dime el lado1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Dime el lado2: "));

        if (lado1 == lado2) {
            c1 = new Calculador(lado1);
        } else {
            c1 = new Calculador(lado1, lado2);
        }

        System.out.println("El area es: " + c1.getArea());
        System.out.println("El perímetro es: " + c1.getPerimetro());

    }
}
