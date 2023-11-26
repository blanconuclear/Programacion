package exercicio2;

public class Conductor extends Traballador {
    private String matricula;

    public Conductor(String dni, String nome, String apelido, String matricula) {
        super(dni, nome, apelido);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
