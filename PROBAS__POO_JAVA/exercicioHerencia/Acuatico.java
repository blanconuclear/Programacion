package exercicioHerencia;

public class Acuatico extends Vehiculo implements Vela, Motor {
    private String tipo;
    private int capacidadeViaxeiros;

    public Acuatico(int velocidadeMaxima, String tipo, int capacidadeViaxeiros) {
        super(velocidadeMaxima);
        this.tipo = tipo;
        this.capacidadeViaxeiros = capacidadeViaxeiros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadeViaxeiros() {
        return capacidadeViaxeiros;
    }

    public void setCapacidadeViaxeiros(int capacidadeViaxeiros) {
        this.capacidadeViaxeiros = capacidadeViaxeiros;
    }

    @Override
    public void acelerar(int velocidade) {
        velocidadeActual += velocidade;

        if (velocidadeActual > velocidadeMaxima) {
            velocidadeActual = velocidadeMaxima;
        }
    }

    @Override
    public void frenar(int velocidade) {
        velocidadeActual -= velocidade;
        if (velocidade <= 0) {
            velocidade = 0;
        }
    }

    @Override
    public int calculaRevolucionesMotor(int fuerza, int radio) {

        return fuerza * radio;
    }

    @Override
    public void recomendarVelocidade(int velocidadeVento) {
        if (velocidadeVento > 60) {
            velocidadeActual = 0;
        } else if (velocidadeVento < 10) {
            velocidadeActual = 0;
        }
    }

}
