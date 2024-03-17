package exceptions;

public class Persoa {
    private String nome;
    private int idade;

    public Persoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public void comprobarIdade() throws ExceptionPersonalizada {
        if (idade < 18) {
            throw new ExceptionPersonalizada("Menor de edad", 1);
        } else {
            System.out.println("Mayor de edad");
        }
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

}
