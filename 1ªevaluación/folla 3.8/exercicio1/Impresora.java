package exercicio1;

/**
 * Impresora
 */
public class Impresora {

    private double precio;
    private String modelo;
    private int follasMinuto;

    public Impresora() {
    }

    public Impresora(double precio, String modelo, int follasMinuto) {
        this.precio = precio;
        this.modelo = modelo;
        this.follasMinuto = follasMinuto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getFollasMinuto() {
        return follasMinuto;
    }

    public void setFollasMinuto(int follasMinuto) {
        this.follasMinuto = follasMinuto;
    }

}