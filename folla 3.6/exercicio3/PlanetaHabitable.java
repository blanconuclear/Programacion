package exercicio3;

/**
 * PlanetaHabitable
 */
public class PlanetaHabitable extends Planeta {

    private int numeroPersoas;
    private int temperaturaMinima;
    private int temperaturaMaxima;

    public PlanetaHabitable(String nome, int tamaño, double distanciaTerra, boolean accesible, int numeroPersoas,
            int temperaturaMinima, int temperaturaMaxima) {
        super(nome, tamaño, distanciaTerra, accesible);
        this.numeroPersoas = numeroPersoas;
        this.temperaturaMinima = temperaturaMinima;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public int getNumeroPersoas() {
        return numeroPersoas;
    }

    public void setNumeroPersoas(int numeroPersoas) {
        this.numeroPersoas = numeroPersoas;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

}