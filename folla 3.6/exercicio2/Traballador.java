package exercicio2;

public class Traballador {
    private String dni;
    private String nome;
    private String apelido;
    static int numTraballadores = 0;

    public Traballador(String dni, String nome, String apelido) {
        this.dni = dni;
        this.nome = nome;
        this.apelido = apelido;
        numTraballadores++;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public static int getNumTraballadores() {
        return numTraballadores;
    }

    public static void setNumTraballadores(int numTraballadores) {
        Traballador.numTraballadores = numTraballadores;
    }

}