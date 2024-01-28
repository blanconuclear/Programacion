package exercicio3;

/**
 * Cidade
 */
public class Cidade implements Comparable {

    private String nome;
    private int poboacion;

    public Cidade(String nome, int poboacion) {
        this.nome = nome;
        this.poboacion = poboacion;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoboacion() {
        return poboacion;
    }

    public void setPoboacion(int poboacion) {
        this.poboacion = poboacion;
    }

    public int compareTo(Object obx) {

        Cidade outraCidade = (Cidade) obx;
        if (this.poboacion < outraCidade.poboacion) {
            return -1;
        }
        if (this.poboacion < outraCidade.poboacion) {
            return 1;
        }
        return 0;
    }

}