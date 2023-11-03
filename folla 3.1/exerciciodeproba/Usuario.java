/**
 * Usuario
 */
public class Usuario {

    /* ATRIBUTOS */
    public String nome;
    private int idade;

    /* MÉTODOS */
    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void SetNome(String nom) {
        nome = nom;
    }

    public String getNome() {
        return nome;
    }

    public void SetIdade(int idade) {
        if (this.idade > 110) {
            this.idade = idade;
        }
    }

    public int getIdade() {
        return this.idade;
    }

}