package exercicio2;

class Capitan extends Tripulante {
    private int horasExperiencia;
    private static final double SOLD_CONSTANTE = 60000;
    private double soldoTotal;
    private double bono;

    public Capitan(String DNI, int idade, int diasNaEmpresa, String nome, double soldo, Barco barco,
            int horasExperiencia) {
        super(DNI, idade, diasNaEmpresa, nome, soldo, barco);
        this.horasExperiencia = horasExperiencia;
        this.bono = calculaBono();
        this.soldoTotal = calculaSoldo();
    }

    public int getHorasExperiencia() {
        return horasExperiencia;
    }

    public void setHorasExperiencia(int horasExperiencia) {
        this.horasExperiencia = horasExperiencia;
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

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public double calculaBono() {
        if (horasExperiencia > 5000 && horasExperiencia < 10000) {
            return 0.2;
        } else if (horasExperiencia >= 10000 && horasExperiencia < 20000) {
            return 0.4;
        } else if (horasExperiencia >= 20000) {
            return 0.5;
        } else {
            return 0.0;
        }
    }

    @Override
    public double calculaSoldo() {
        soldoTotal = SOLD_CONSTANTE + (SOLD_CONSTANTE * bono);
        return soldoTotal;
    }

    @Override
    public void mostraDatos() {
        System.out.println("Capitán:");
        System.out.println(super.toString());
        System.out.println("Horas de Experiencia: " + horasExperiencia);
        System.out.println("Bono: " + (bono * 100) + "%");
        System.out.println("Soldo Total: " + soldoTotal);
    }

}
