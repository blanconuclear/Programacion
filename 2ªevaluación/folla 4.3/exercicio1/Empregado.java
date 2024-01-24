package exercicio1;

/**
 * Empregado
 */
public class Empregado extends Persoa {

    private int soldo;

    public Empregado(String nome, String apelido, int idade, int soldo) {
        super(nome, apelido, idade);
        this.soldo = soldo;
    }

    public int getSoldo() {
        return soldo;
    }

    @Override
    String dameDescricion() {
        return "Nome: " + nome + ", Apelido: " + apelido + ", Idade: " + idade + ", Soldo: " + soldo;
    }

}