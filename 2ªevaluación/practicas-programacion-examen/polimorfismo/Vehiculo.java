package polimorfismo;

public class Vehiculo {
    protected String matriculo;
    protected String marca;
    protected String modelo;

    public Vehiculo(String matriculo, String marca, String modelo) {
        this.matriculo = matriculo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatriculo() {
        return matriculo;
    }

    public void setMatriculo(String matriculo) {
        this.matriculo = matriculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String mostrarDatos() {
        return "matriculo=" + matriculo + ", marca=" + marca + ", modelo=" + modelo;
    }

}
