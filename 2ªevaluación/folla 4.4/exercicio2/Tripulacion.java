package exercicio2;

abstract class Tripulacion {
    private String DNI;
    private int edad;
    private int diasEnEmpresa;
    private String nombre;
    private double salario;
    private Barco barco;

    public Tripulacion(String DNI, int edad, int diasEnEmpresa, String nombre, double salario, Barco barco) {
        this.DNI = DNI;
        this.edad = edad;
        this.diasEnEmpresa = diasEnEmpresa;
        this.nombre = nombre;
        this.salario = salario;
        this.barco = barco;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDiasEnEmpresa() {
        return diasEnEmpresa;
    }

    public void setDiasEnEmpresa(int diasEnEmpresa) {
        this.diasEnEmpresa = diasEnEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public abstract double calcularSalario();

    public abstract void mostrarDatos();
}
