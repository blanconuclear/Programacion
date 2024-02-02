package exercicio2;

abstract class Tripulante {
    private String DNI;
    private int idade;
    private int diasNaEmpresa;
    private String nome;
    private double soldo;
    private Barco barco;

    public Tripulante(String DNI, int idade, int diasNaEmpresa, String nome, double soldo, Barco barco) {
        this.DNI = DNI;
        this.idade = idade;
        this.diasNaEmpresa = diasNaEmpresa;
        this.nome = nome;
        this.soldo = soldo;
        this.barco = barco;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDiasNaEmpresa() {
        return diasNaEmpresa;
    }

    public void setDiasNaEmpresa(int diasNaEmpresa) {
        this.diasNaEmpresa = diasNaEmpresa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSoldo() {
        return soldo;
    }

    public void setSoldo(double soldo) {
        this.soldo = soldo;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public abstract double calculaSoldo();

    public abstract void mostraDatos();
}
