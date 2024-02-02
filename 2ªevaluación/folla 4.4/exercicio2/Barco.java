package exercicio2;

class Barco {
    private String nombre;
    private int numeroTripulacion;
    private double capacidadCarga;

    public Barco(String nombre, int numeroTripulacion, double capacidadCarga) {
        this.nombre = nombre;
        this.numeroTripulacion = numeroTripulacion;
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Barco [nombre=" + nombre + ", numeroTripulacion=" + numeroTripulacion + ", capacidadCarga="
                + capacidadCarga + "]";
    }
}
