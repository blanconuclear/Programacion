package persona;

public class Persoa {
    private String nome;
    private String apelido;
    private int idade;

    public Persoa(String nome, String apelido, int idade) {
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimir() {
        System.out.println("nome: " + nome);
        System.out.println("apelido: " + apelido);
        System.out.println("idade: " + idade);
    }

    public void maiorIdade() {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade");
        } else {
            System.out.println("non eres maior de idade");
        }
    }

    public void autenticidade() {
        if (nome.equals("Efrén")) {
            System.out.println(nome + " pode pasar");
        } else {
            System.out.println(nome + " NON pode pasar");

        }
    }

}
