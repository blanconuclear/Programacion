package Exercicio4;

/**
 * Xogador
 */
public class Xogador {

    private String nome;
    private int idade;

    public Xogador() {
        nome = "Andrés";
        idade = 40;
    }

    public Xogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Xogador(String nome) {
        this.nome = nome;
    }

    public void SetIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

}