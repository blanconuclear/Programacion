package exercicioHerencia;

public abstract class Vehiculo {

    int velocidadeActual;
    int velocidadeMaxima;

    public Vehiculo(int velocidadeMaxima) {
        this.velocidadeActual = 0;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public abstract void acelerar(int velocidade);

    public abstract void frenar(int velocidade);

    public void imprimir() {
        System.out.println("Velocidad actual: " + velocidadeActual);
        System.out.println("Velocidad máxima: " + velocidadeMaxima);
    }

}
