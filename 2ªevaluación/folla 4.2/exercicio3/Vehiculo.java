package exercicio3;

/**
 * Vehiculo
 */
abstract class Vehiculo {

    int velocidadeActual;
    int velocidadeMaxima;

    abstract void acelerar(int incremento);

    abstract void frear(int decremento);

    void imprimir() {
        System.out.println("Velocidad actual: " + velocidadeActual + " km/h");
        System.out.println("Velocidad máxima: " + velocidadeMaxima + " km/h");
    }

}