package exercicio1;

/**
 * Camion
 */
public class Camion extends Vehiculo {

    private double precioDia;
    private int diaInicio;
    private int diaFinal;
    private static int numCamions;
    private static int numCamionsAlugados;

    public Camion(String matricula, boolean alugado, double precioDia, int diaInicio, int diaFinal) {
        super(matricula, alugado);
        this.precioDia = precioDia;
        this.diaInicio = diaInicio;
        this.diaFinal = diaFinal;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public int getDiaInicio() {
        return diaInicio;
    }

    public void setDiaInicio(int diaInicio) {
        this.diaInicio = diaInicio;
    }

    public int getDiaFinal() {
        return diaFinal;
    }

    public void setDiaFinal(int diaFinal) {
        this.diaFinal = diaFinal;
    }

    public static int getNumCamions() {
        return numCamions;
    }

    public static void setNumCamions(int numCamions) {
        Camion.numCamions = numCamions;
    }

    public static int getNumCamionsAlugados() {
        return numCamionsAlugados;
    }

    public static void setNumCamionsAlugados(int numCamionsAlugados) {
        Camion.numCamionsAlugados = numCamionsAlugados;
    }

}