import javax.swing.JOptionPane;

class Coche {
    private String matricula;
    private double precio;
    private String modelo;

    public Coche(String matricula, double precio, String modelo) throws Exception {
        if (!comprobarMatricula(matricula)) {
            throw new Exception("A matrícula non cumpre coa normal actual.");
        }
        if (!comprobarPrecio(precio)) {
            throw new Exception("O prezo debe estar entre 10000 e 100000.");
        }
        if (!comprobarModelo(modelo)) {
            throw new Exception("O modelo non é válido. Só vendemos Tesla e Toyota.");
        }

        this.matricula = matricula;
        this.precio = precio;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    private static boolean comprobarMatricula(String matricula) {
        return matricula.matches("[0-9]{4}[bcdfghj-np-tv-zBCDFGHJ-NP-TV-Z]{3}");
    }

    private static boolean comprobarPrecio(double precio) {
        return precio >= 10000 && precio <= 100000;
    }

    private static boolean comprobarModelo(String modelo) {
        return modelo.startsWith("Tesla") || modelo.startsWith("Toyota");
    }
}

public class AppCoche {
    public static void main(String[] args) {
        Coche[] coches = new Coche[4];
        int contadorCoches = 0;

        while (true) {
            String opcion = JOptionPane.showInputDialog("Seleccione unha opción:\n"
                    + "a) Introducir un vehículo\n"
                    + "b) Mostrar vehículos\n"
                    + "c) Saír");

            if (opcion == null || opcion.equalsIgnoreCase("c")) {
                break;
            }

            switch (opcion.toLowerCase()) {
                case "a":
                    try {
                        String matricula = JOptionPane.showInputDialog("Introduza a matrícula:");
                        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduza o prezo:"));
                        String modelo = JOptionPane.showInputDialog("Introduza o modelo:");

                        Coche coche = new Coche(matricula, precio, modelo);
                        coches[contadorCoches++] = coche;

                        JOptionPane.showMessageDialog(null, "Coche engadido con éxito.");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
                    }
                    break;

                case "b":
                    StringBuilder infoCoches = new StringBuilder("Vehículos:\n");
                    for (int i = 0; i < contadorCoches; i++) {
                        Coche coche = coches[i];
                        infoCoches.append("Matrícula: ").append(coche.getMatricula()).append(", ");
                        infoCoches.append("Prezo: ").append(coche.getPrecio()).append(", ");
                        infoCoches.append("Modelo: ").append(coche.getModelo()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, infoCoches.toString());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción non válida.");
            }
        }
    }
}
