package exercicio3;

import javax.swing.JOptionPane;

public class AppCoche {

    public static void main(String[] args) {

        Coche[] arrayCoches = new Coche[0];
        String menu = """
                a) Introducir un vehículo
                b) Mostrar vehículos
                c) Saír
                    """;

        String opcion = JOptionPane.showInputDialog(menu);

        while (!opcion.toLowerCase().equals("c")) {

            switch (opcion.toLowerCase()) {
                case "a":
                    try {
                        String matricula = JOptionPane.showInputDialog("Introduce a matrícula: ");
                        double prezo = Double.parseDouble(JOptionPane.showInputDialog("Introduce o prezo: "));
                        String modelo = JOptionPane.showInputDialog("Introduce o modeloq: ");

                        Coche coche = new Coche(matricula, prezo, modelo);

                        JOptionPane.showMessageDialog(null, "Coche engadido con éxito.");

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "b":

                    for (Coche coche : arrayCoches) {
                        System.out.println(coche.getMatricula());
                    }

                default:
                    break;
            }
        }

    }
}