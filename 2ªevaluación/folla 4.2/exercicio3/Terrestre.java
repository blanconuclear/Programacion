package exercicio3;

/**
 * terrestre
 */
public class Terrestre extends Vehiculo {

    private int cantidadeRodas;
    private String tipoVehiculo;

    public Terrestre(int cantidadeRodas, String tipoVehiculo) {
        this.cantidadeRodas = cantidadeRodas;
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    int acelerar() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    int frear() {
        // TODO Auto-generated method stub
        return 0;
    }

}