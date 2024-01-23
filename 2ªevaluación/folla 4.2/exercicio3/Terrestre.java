package exercicio3;

/**
 * Terrestre
 */
public class Terrestre extends Vehiculo {

    int cantidadeRodas;
    String tipoVehiculo;

    @Override
    void acelerar(int incremento) {
        velocidadeActual += incremento;
        if (velocidadeActual > velocidadeMaxima) {
            velocidadeActual = velocidadeMaxima;
        }
    }

    @Override
    void frear(int decremento) {
        velocidadeActual -= decremento;
        if (velocidadeActual < 0) {
            velocidadeActual = 0;
        }
    }
}
