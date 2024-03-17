package herencia;

public class Estudiante extends Persona {

    int numEstudiante;
    String nomCarreira;

    public Estudiante(String nome, int edad, int numEstudiante, String nomCarreira) {
        super(nome, edad);
        this.numEstudiante = numEstudiante;
        this.nomCarreira = nomCarreira;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }

    public void setNumEstudiante(int numEstudiante) {
        this.numEstudiante = numEstudiante;
    }

    public String getNomCarreira() {
        return nomCarreira;
    }

    public void setNomCarreira(String nomCarreira) {
        this.nomCarreira = nomCarreira;
    }

    @Override
    public String toString() {
        return super.toString() + ", Estudiante [numEstudiante=" + numEstudiante + ", nomCarreira=" + nomCarreira + "]";
    }

}
