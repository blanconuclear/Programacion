package exercicio1;

/**
 * Persoa
 */
abstract class Persoa {

    String nome;
    String apelido;
    int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    abstract void dameDescricion();

}