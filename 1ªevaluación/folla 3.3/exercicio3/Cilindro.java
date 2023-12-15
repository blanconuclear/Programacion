/*
 * Crea unha clase Cilindro, cun atributos radio e altura. A clase debe contar
 * con 2 construtores, os setters e
 * getters, e dous métodos estáticos, que reciban como parámetro o radio (rad) e
 * altura (alt), e farán o cálculo
 * da área e volume do cilindro. Emprega unha variable final para PI.
 * A área do cilindro é: 2 * PI * radio * (radio + altura), e o volume: é PI *
 * radio2 * altura
 * 
 * 
 * Define tamén dous métodos non estáticos calculaArea( ), e calculaVolume(),
 * que deben calcular área e
 * volume empregando os valores dos atributos do obxecto (deberán chamar aos
 * métodos estáticos xa
 * creados).
 * Crea na túa clase AppCilindro 3 cilindros e comproba todos os métodos da
 * clase. Comproba que podes
 * chamar aos métodos estáticos desde a clase Cilindro directamente.
 */

package exercicio3;

public class Cilindro {

    private double radio;
    private double altura;
    private static final double PI = 3.1416;

    public Cilindro() {
    }

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getRadio() {
        return radio;
    }

    public static double area(double radio, double altura) {

        double areaCilindro = 2 * PI * radio * (radio + altura);
        return areaCilindro;
    }

    public static double volume(double radio, double altura) {
        double volumeCilindro = PI * radio * radio * altura;
        return volumeCilindro;
    }

    public double calculaArea() {
        return area(this.radio, this.altura);
    }

    public double calculaVolume() {
        return volume(this.radio, this.altura);
    }
}