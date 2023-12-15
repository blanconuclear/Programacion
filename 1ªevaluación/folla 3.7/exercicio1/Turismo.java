package exercicio1;

/**
 * Turismo
 */
public class Turismo extends Vehiculo {

    private Double precioKm;
    private int KmAlquiler;
    private int kmDevolucion;
    private static int numTurismos;
    private static int numTurAlquilados;

    public Turismo(String matricula, boolean alugado,
            Double precioKm, int kmAlquiler, int kmDevolucion) {
        super(matricula, alugado);
        this.precioKm = precioKm;
        this.KmAlquiler = kmAlquiler;
        this.kmDevolucion = kmDevolucion;
    }

    public Double getPrecioKm() {
        return precioKm;
    }

    public void setPrecioKm(Double precioKm) {
        this.precioKm = precioKm;
    }

    public int getKmAlquiler() {
        return KmAlquiler;
    }

    public void setKmAlquiler(int kmAlquiler) {
        KmAlquiler = kmAlquiler;
    }

    public int getKmDevolucion() {
        return kmDevolucion;
    }

    public void setKmDevolucion(int kmDevolucion) {
        this.kmDevolucion = kmDevolucion;
    }

    public static int getNumTurismos() {
        return numTurismos;
    }

    public static void setNumTurismos(int numTurismos) {
        Turismo.numTurismos = numTurismos;
    }

    public static int getNumTurAlquilados() {
        return numTurAlquilados;
    }

    public static void setNumTurAlquilados(int numTurAlquilados) {
        Turismo.numTurAlquilados = numTurAlquilados;
    }

    /* -------------------- */

    public void alugar() {
        if (this.isAlugado() == true) {
            System.out.println("O turismo esstá alugado");
        } else {
            System.out.println("Está alugado");
        }
    }

    public void mostraInf() {
        System.out.println(this.precioKm);
        System.out.println(this.kmDevolucion);
        System.out.println(this.KmAlquiler);
        System.out.println(Turismo.numTurAlquilados);
        System.out.println(Turismo.numTurismos);
    }

}
