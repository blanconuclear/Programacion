package exercicio2;

public class XefeFlota extends Tripulante {
    private int pesoPeixe;
    private int pesoMarisco;
    private static final double SOLD_CONSTANTE = 200000;
    private double soldoTotal;
    private double bonoPeixe;
    private double bonoMarisco;

    public XefeFlota(String DNI, int idade, int diasNaEmpresa, String nome, double soldo, Barco barco,
            int pesoPeixe, int pesoMarisco) {
        super(DNI, idade, diasNaEmpresa, nome, soldo, barco);
        this.pesoPeixe = pesoPeixe;
        this.pesoMarisco = pesoMarisco;
        this.bonoPeixe = calculaBonoPeixe();
        this.bonoMarisco = calculaBonoMarisco();
        this.soldoTotal = calculaSoldo();
    }

    public int getPesoPeixe() {
        return pesoPeixe;
    }

    public void setPesoPeixe(int pesoPeixe) {
        this.pesoPeixe = pesoPeixe;
    }

    public int getPesoMarisco() {
        return pesoMarisco;
    }

    public void setPesoMarisco(int pesoMarisco) {
        this.pesoMarisco = pesoMarisco;
    }

    public static double getSoldConstante() {
        return SOLD_CONSTANTE;
    }

    public double getSoldoTotal() {
        return soldoTotal;
    }

    public void setSoldoTotal(double soldoTotal) {
        this.soldoTotal = soldoTotal;
    }

    public double getBonoPeixe() {
        return bonoPeixe;
    }

    public void setBonoPeixe(double bonoPeixe) {
        this.bonoPeixe = bonoPeixe;
    }

    public double getBonoMarisco() {
        return bonoMarisco;
    }

    public void setBonoMarisco(double bonoMarisco) {
        this.bonoMarisco = bonoMarisco;
    }

    public double calculaBonoPeixe() {
        return pesoPeixe * 1.5;
    }

    public double calculaBonoMarisco() {
        return pesoMarisco * 2.0;
    }

    @Override
    public double calculaSoldo() {
        soldoTotal = SOLD_CONSTANTE + bonoPeixe + bonoMarisco;
        return soldoTotal;
    }

    @Override
    public void mostraDatos() {
        System.out.println("Xefe de Flota:");
        System.out.println(super.toString());
        System.out.println("Peso de Peixe: " + pesoPeixe);
        System.out.println("Peso de Marisco: " + pesoMarisco);
        System.out.println("Bono de Peixe: " + bonoPeixe);
        System.out.println("Bono de Marisco: " + bonoMarisco);
        System.out.println("Soldo Total: " + soldoTotal);
    }

}