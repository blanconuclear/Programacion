package polimorfismo;

public class VehiculoDeportivo extends Vehiculo {

    private int cilindrada;

    public VehiculoDeportivo(String matriculo, String marca, String modelo, int cilindrada) {
        super(matriculo, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String mostrarDatos() {

        return super.mostrarDatos() + " cilindrada: " + cilindrada;
    }

}
