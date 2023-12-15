package exercicio6;

public class Dinosaurio {
    private String nome;
    private int idade;

    public Dinosaurio() {
        nome = "Alf";
        idade = 5;
    }

    public Dinosaurio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
