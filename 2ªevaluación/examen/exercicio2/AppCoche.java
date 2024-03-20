package exercicio2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AppCoche {

    public static void main(String[] args) {

        List<Coche> listaCoches = new ArrayList<>();

        mostrarMenu();

        String opcion = JOptionPane.showInputDialog("Dime unha opción do menú: ");

        while (!opcion.equals("c")) {
            switch (opcion) {
                case "a":
                    engadirVehiculo(listaCoches);
                    break;
                case "b":
                    mostrarVehiculos(listaCoches);
            }

            mostrarMenu();

            opcion = JOptionPane.showInputDialog("Dime unha opción do menú: ");
        }
    }

    // Engadir vehículo.
    public static void engadirVehiculo(List<Coche> listaCoches) {
        for (int i = 0; i < 4; i++) {
            String matricula = JOptionPane.showInputDialog("Dime a matrícula: ");
            int prezo = Integer.parseInt(JOptionPane.showInputDialog("Dime o prezo (entre 10000 e 1000000): "));
            String modelo = JOptionPane.showInputDialog("Dime o modelo (Tesla ou Toyota): ");

            Coche coche = new Coche(matricula, prezo, modelo);

            try {
                coche.validarPrezo();
                coche.validarModelo();
            } catch (CocheException e) {
                e.printStackTrace();
            }

            listaCoches.add(coche);
        }
    }

    // Mostrar vehículo
    public static void mostrarVehiculos(List<Coche> listaCoches) {
        for (Coche coche : listaCoches) {
            System.out.println(coche.toString());
        }
    }

    // Menú
    public static void mostrarMenu() {
        String menu = """
                a) Introducir un vehículo.
                b) Mostrar vehículos.
                c) Sair
                """;

        System.out.println(menu);
    }
}