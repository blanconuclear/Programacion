package exercicio3;

/**
 * Vehiculo
 */
public abstract class Vehiculo {

    private int velocidadeActual = 0;
    private int velocidadeMaxima = 0;

    abstract int acelerar();

    abstract int frear();

    @Override
    public String toString() {
        return "Vehiculo [velocidadeActual=" + velocidadeActual + ", velocidadeMaxima=" + velocidadeMaxima + "]";
    }

}