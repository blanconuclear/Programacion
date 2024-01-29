package ejercicio1;

public class Calculador {

    private float lado1;
    private float lado2;

    public Calculador(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Calculador(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getPerimetro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    public float getArea() {
        return lado1 * lado1;
    }

}
