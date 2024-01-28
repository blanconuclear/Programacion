package exercicio2;

public class Estudante extends Persoa implements Comparable {
    private String titulacion;

    public Estudante(String nome, String apelido, int idade, String titulacion) {
        super(nome, apelido, idade);
        this.titulacion = titulacion;
    }

    @Override
    String dameDescricion() {
        return "Nome: " + nome + ", Apelido: " + apelido + ", Idade: " + idade + ", Titulacion: " + titulacion;
    }

    @Override
    public int compareTo(Object objeto) {
        Estudante unEstudante = (Estudante) objeto;

        if (this.idade < unEstudante.idade) {
            return -1;
        }
        if (this.idade > unEstudante.idade) {
            return 1;
        }
        return 0;
    }
}