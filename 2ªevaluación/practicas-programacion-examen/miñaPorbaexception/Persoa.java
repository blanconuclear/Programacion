package miñaPorbaexception;

public class Persoa {
    private String nome;
    private int idade;

    public Persoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comprobarIdade(int idade) throws ExceptionPersonalizada {
        if (idade < 18) {
            throw new ExceptionPersonalizada("Menor de idade", 1);
        } else {
            System.out.println("maior de idade");
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
