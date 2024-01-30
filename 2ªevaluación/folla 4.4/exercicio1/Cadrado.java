package exercicio1;

public class Cadrado extends Figura {
    private int lado;

    public Cadrado(int lado, int area, String cor) {
        super(area, cor);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
