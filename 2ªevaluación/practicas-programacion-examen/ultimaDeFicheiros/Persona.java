package ultimaDeFicheiros;

import exceptions.ExceptionPersonalizada;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public void validarEdad() throws ExceptionPersonalizada {
        if (edad < 18) {
            throw new ExceptionPersonalizada("Idade incorrecta", 1);
        } else {
            System.out.println("Idade correcta");
        }
    }

    // Métodos para acceder y modificar los atributos de la clase Persona
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
    }

}
