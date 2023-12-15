package exercicio2;

/**
 * Sobremesa
 */
public class Sobremesa extends Computador {

    private Boolean wifi;
    private int numDiscos;

    public Sobremesa(String procesador, String ram, String discoDuro, String pracaBase) {
        super(procesador, ram, discoDuro, pracaBase);
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public int getNumDiscos() {
        return numDiscos;
    }

    public void listaAtributos() {
        System.out.println("Número de discos" + this.numDiscos);
        System.out.println("Wifi" + this.wifi);
        System.out.println("Disco Duro: " + this.getDiscoDuro());
        System.out.println("Praca Base: " + this.getPracaBase());
        System.out.println("Procesador: " + this.getProcesador());
        System.out.println("Ram: " + this.getRam());
    }

}