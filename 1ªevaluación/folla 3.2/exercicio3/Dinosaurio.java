package exercicio3;

public class Dinosaurio {
    private String nome;
    private int idade;

    public static int numDinosaurio = 0;

    public Dinosaurio() {
        nome = "Alf";
        idade = 5;
        numDinosaurio++;
    }

    public Dinosaurio(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        numDinosaurio++;
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

    public static String eMaisVello(Dinosaurio din1, Dinosaurio din2) {
        if (din1.idade > din2.idade) {
            return din1.nome;
        } else {
            return din2.nome;
        }
    }
}
