package exercicio2;

/**
 * Computador
 */
public class Computador {

    private String procesador;
    private String ram;
    private String discoDuro;
    private String pracaBase;
    private static int numComputadores = 0;

    public Computador(String procesador, String ram, String discoDuro, String pracaBase) {
        this.procesador = procesador;
        this.ram = ram;
        this.discoDuro = discoDuro;
        this.pracaBase = pracaBase;
        numComputadores++;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getPracaBase() {
        return pracaBase;
    }

    public void setPracaBase(String pracaBase) {
        this.pracaBase = pracaBase;
    }

    public static int getNumComputadores() {
        return numComputadores;
    }

    public static void setNumComputadores(int numComputadores) {
        Computador.numComputadores = numComputadores;
    }

}