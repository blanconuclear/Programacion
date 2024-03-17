package polimorfismo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Appvehiculo {
    public static void main(String[] args) {

        List<Vehiculo> lista = new ArrayList<>();

        // Solicitar los datos del vehículo
        String matricula = JOptionPane.showInputDialog("Dime la matricula: ");
        String marca = JOptionPane.showInputDialog("Dime la marca: ");
        String modelo = JOptionPane.showInputDialog("Dime el modelo: ");
        int cilindrada = Integer.parseInt(JOptionPane.showInputDialog("Dime la cilindrara: "));

        // Crear un nuevo vehículo
        Vehiculo vehiculoD = new VehiculoDeportivo(matricula, marca, modelo, cilindrada);

        // Añadir el vehículo a la lista
        lista.add(vehiculoD);

        // Mostrar los datos del vehículo
        for (Vehiculo vehiculo : lista) {
            System.out.println(vehiculo.mostrarDatos());
        }

    }
}
