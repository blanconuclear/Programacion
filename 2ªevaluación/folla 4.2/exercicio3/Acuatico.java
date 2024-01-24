package exercicio3;

/**
 * Acuatico
 */
public class Acuatico extends Vehiculo implements Motor, Vela {

    String superficie;
    int capacidadeViaxeiros;

    public Acuatico(String superficie, int capacidadeViaxeiros, int velocidadeActual, int velocidadeMaxima) {
        this.superficie = superficie;
        this.capacidadeViaxeiros = capacidadeViaxeiros;
        this.velocidadeActual = velocidadeActual;
        this.velocidadeMaxima = velocidadeMaxima;
    }

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

    @Override
    public void recomendarVelocidade(int velocidadeVento) {
        if (velocidadeVento > 60 && velocidadeVento < 10) {
            velocidadeActual = 0;
        }
    }

    @Override
    public int calculaRevolucionsMotor(int forza, int radio) {

        return forza * radio;
    }

}