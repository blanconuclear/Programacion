package metodoConstructor;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos(String nombre, int edad) {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad: " + edad);
    }

    public static void main(String[] args) {
        Persona per1 = new Persona("Jose", 27);
        Persona per2 = new Persona("Manu", 34);

    }
}
