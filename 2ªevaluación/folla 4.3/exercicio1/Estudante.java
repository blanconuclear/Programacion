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

    public int compareTo(Object obx) {
        // Temos que facer o casting para acceder aos atributos de Estudante
        Estudante outroEstudante = (Estudante) obx;
        if (this.idade < outroEstudante.idade) {
            return -1;
        }
        if (this.idade > outroEstudante.idade) {
            return 1;
        }
        return 0;
    }
}
