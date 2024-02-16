package exercicio3;

public class Coche {

    private String matricula;
    private double prezo;
    private String modelo;

    public Coche(String matricula, double prezo, String modelo) {
        this.matricula = matricula;
        this.prezo = prezo;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private static boolean comprobarMatricula(String matricula) {
        return matricula.matches("[0-9]{4}[bcdfghj-np-tv-zBCDFGHJ-NP-TV-Z]{3}");
    }

    private static boolean comprobarPrecio(double prezo) {
        return prezo >= 10000 && prezo <= 100000;
    }

    private static boolean comprobarModelo(String modelo) {
        return modelo.startsWith("Tesla") || modelo.startsWith("Toyota");
    }

}