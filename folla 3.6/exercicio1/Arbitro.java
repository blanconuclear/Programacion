package exercicio1;

public class Arbitro extends Participante {

    private int anosArbitrando;

    public Arbitro(String nome, int idade, int anosArbitrando) {
        super(nome, idade);
        this.anosArbitrando = anosArbitrando;
    }

    public int getAnosArbitrando() {
        return anosArbitrando;
    }

    public void setAnosArbitrando(int anosArbitrando) {
        this.anosArbitrando = anosArbitrando;
    }

}
