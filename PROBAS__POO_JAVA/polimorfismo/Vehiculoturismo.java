package polimorfismo;

public class Vehiculoturismo extends Vehiculo {

    private int nPuertas;

    public Vehiculoturismo(String matricula, String marca, String modelo, int nPuertas) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", nPuertas=" + nPuertas
                + "]";
    }

}
