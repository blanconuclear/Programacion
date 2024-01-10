package exercicio1;

public class BiciElect {

    private String nome;
    private String marca;
    private int autonomiaKms;
    private static int numBicis = 0;

    public BiciElect() {
    }

    public BiciElect(String nome, String marca, int autonomiaKms) {
        this.nome = nome;
        this.marca = marca;
        this.autonomiaKms = autonomiaKms;
        numBicis++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAutonomiaKms() {
        return autonomiaKms;
    }

    public void setAutonomiaKms(int autonomiaKms) {
        this.autonomiaKms = autonomiaKms;
    }

    public static int getNumBicis() {
        return numBicis;
    }

    public static void setNumBicis(int numBicis) {
        BiciElect.numBicis = numBicis;
    }

    public static BiciElect comparaAutonomiaMax(BiciElect bici1, BiciElect bici2) {

        if (bici1.autonomiaKms > bici2.autonomiaKms) {
            return bici1;
        }
        return bici2;

    }

    public static BiciElect comparaAutonomiaMin(BiciElect bici1, BiciElect bici2) {

        if (bici1.autonomiaKms < bici2.autonomiaKms) {
            return bici1;
        }
        return bici2;

    }

}
