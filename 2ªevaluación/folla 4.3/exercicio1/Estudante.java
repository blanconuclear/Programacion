package exercicio1;

public class Estudante extends Persoa {
    private String titulacion;

    public Estudante(String nome, String apelido, int idade, String titulacion) {
        super(nome, apelido, idade);
        this.titulacion = titulacion;
    }

    @Override
    String dameDescricion() {
        return "Nome: " + nome + ", Apelido: " + apelido + ", Idade: " + idade + ", Titulacion: " + titulacion;
    }

}
