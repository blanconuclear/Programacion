package exercicio2;

abstract class Persoa {

    protected String nome;
    protected String apelido;
    protected int idade;

    public Persoa(String nome, String apelido, int idade) {
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
    }

    abstract String dameDescricion();

    String dameNome() {
        return nome;
    }

}