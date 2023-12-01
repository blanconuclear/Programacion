package exercicio2;

/**
 * Portatil
 */
public class Portatil extends Computador {

    private int peso;
    private String cor;

    public Portatil(String procesador, String ram, String discoDuro, String pracaBase, int peso, String cor) {
        super(procesador, ram, discoDuro, pracaBase);
        this.peso = peso;
        this.cor = cor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void listaAtributos() {
        System.out.println("Peso: " + this.peso);
        System.out.println("Cor: " + this.cor);
        System.out.println("Disco Duro: " + this.getDiscoDuro());
        System.out.println("Praca Base: " + this.getPracaBase());
        System.out.println("Procesador: " + this.getProcesador());
        System.out.println("Ram: " + this.getRam());
    }
}