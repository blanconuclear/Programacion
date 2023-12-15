package exercicio3;

public class Planeta {

    private String nome;
    private int tamaño;
    private double distanciaTerra;
    private boolean accesible = true;
    private static int numPlanetasAccesibles = 0;

    public Planeta(String nome, int tamaño, double distanciaTerra, boolean accesible) {
        this.nome = nome;
        this.tamaño = tamaño;
        this.distanciaTerra = distanciaTerra;
        this.accesible = accesible;
        numPlanetasAccesibles++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public double getDistanciaTerra() {
        return distanciaTerra;
    }

    public void setDistanciaTerra(double distanciaTerra) {
        this.distanciaTerra = distanciaTerra;
    }

    public boolean isAccesible() {
        return accesible;
    }

    public void setAccesible(boolean accesible) {
        this.accesible = accesible;
    }

    public static int getNumPlanetasAccesibles() {
        return numPlanetasAccesibles;
    }

    public static void setNumPlanetasAccesibles(int numPlanetasAccesibles) {
        Planeta.numPlanetasAccesibles = numPlanetasAccesibles;
    }

    public void explotou() {
        if (accesible == false) {
            numPlanetasAccesibles--;
        }
    }

    public void listaTodo() {
        System.out.println(
                "Nome: " + this.nome + " Tamaño: " + this.tamaño + " Distancia a terra: " + this.distanciaTerra);
    }

}