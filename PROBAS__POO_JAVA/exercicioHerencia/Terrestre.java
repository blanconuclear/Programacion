package exercicioHerencia;

public class Terrestre extends Vehiculo implements Motor {
    private int numeroRodas;
    private String usoVehiculo;

    public Terrestre(int velocidadeMaxima, int numeroRodas, String usoVehiculo) {
        super(velocidadeMaxima);
        this.numeroRodas = numeroRodas;
        this.usoVehiculo = usoVehiculo;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }

    public String getUsoVehiculo() {
        return usoVehiculo;
    }

    public void setUsoVehiculo(String usoVehiculo) {
        this.usoVehiculo = usoVehiculo;
    }

    @Override
    public int calculaRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
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

}
