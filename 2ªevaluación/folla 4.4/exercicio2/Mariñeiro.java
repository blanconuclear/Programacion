package exercicio2;

public class Mariñeiro extends Tripulante {
    private int pesoTotalPescado;
    private static final double SOLD_CONSTANTE = 40000;
    private double soldoTotal;
    private float bono;

    public Mariñeiro(String DNI, int idade, int diasNaEmpresa, String nome, double soldo, Barco barco,
            int pesoTotalPescado) {
        super(DNI, idade, diasNaEmpresa, nome, soldo, barco);
        this.pesoTotalPescado = pesoTotalPescado;
        this.bono = calculaBono();
        this.soldoTotal = calculaSoldo();
    }

    public int getPesoTotalPescado() {
        return pesoTotalPescado;
    }

    public void setPesoTotalPescado(int pesoTotalPescado) {
        this.pesoTotalPescado = pesoTotalPescado;
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

    public float getBono() {
        return bono;
    }

    public void setBono(float bono) {
        this.bono = bono;
    }

    public float calculaBono() {
        if (pesoTotalPescado >= 1) {
            return 0.25f;
        } else {
            return 0.0f;
        }
    }

    @Override
    public double calculaSoldo() {
        soldoTotal = SOLD_CONSTANTE + (SOLD_CONSTANTE * bono);
        return soldoTotal;
    }

    @Override
    public void mostraDatos() {
        System.out.println("Mariñeiro:");
        System.out.println(super.toString());
        System.out.println("Peso Total Pescado: " + pesoTotalPescado);
        System.out.println("Bono: " + bono * 100 + "%");
        System.out.println("Soldo Total: " + soldoTotal);
    }
}
