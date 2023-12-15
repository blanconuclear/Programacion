package exercicio1;

public class Xogador extends Participante {
    private String postoCampo;

    public Xogador(String nome, int idade, String postoCampo) {
        super(nome, idade);
        this.postoCampo = postoCampo;
    }

    public String getPostoCampo() {
        return postoCampo;
    }

    public void setPostoCampo(String postoCampo) {
        this.postoCampo = postoCampo;
    }

}
