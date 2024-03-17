package polimorfismo;

public class VehiculoFurgoneta extends Vehiculo {
    private int carga;

    public VehiculoFurgoneta(String matriculo, String marca, String modelo, int carga) {
        super(matriculo, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + " carga: " + carga;
    }

}
