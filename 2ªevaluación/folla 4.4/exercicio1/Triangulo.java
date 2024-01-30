package exercicio1;

public class Triangulo extends Figura {
    private int base;
    private int altura;

    public Triangulo(int base, int altura, int area, String cor) {
        super(area, cor);
        this.base = base;
        this.altura = altura;
    }

    // Getters y setters para base
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    // Getters y setters para altura
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
