package herencia;

public class Profesor extends Persona {
    private String puesto;
    private int codigoTrabajador;

    public Profesor(String nombre, String apellido, int edad, String puesto, int codigoTrabajador) {
        super(nombre, apellido, edad);
        this.puesto = puesto;
        this.codigoTrabajador = codigoTrabajador;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + edad);
        System.out.println("Puesto: " + getPuesto());
        System.out.println("Codigo Trabajador: " + getCodigoTrabajador());
    }

    @Override
    public void saludo() {
        System.out.println("Hola, soy profesor");
    }
}
