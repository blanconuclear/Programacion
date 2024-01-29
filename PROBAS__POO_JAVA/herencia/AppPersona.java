package herencia;

public class AppPersona {
    public static void main(String[] args) {

        Profesor profesor1 = new Profesor("Hugo", "Sanchez", 26, "Director", 234);

        Estudiante estudiante1 = new Estudiante("Efrén", "Corzón", 32, 456, 8);

        profesor1.mostrarDatos();
        profesor1.saludo();
        estudiante1.mostrarDatos();
        estudiante1.saludo();

    }
}
