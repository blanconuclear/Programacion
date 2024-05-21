package serializacion;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nome;
    private int idade;

    public Persona(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Persona [nome=" + nome + ", idade=" + idade + "]";
    }

}
