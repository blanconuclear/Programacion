package exercicio1;

public class Circulo extends Figura {
    private double raio;

    public Circulo(int raio, int area, String cor) {
        super(area, cor);
        this.raio = raio;
    }

    // Getter y setter para raio
    public double getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}