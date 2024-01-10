package exercicio2;

public class Empresa {

    private String nome;
    private String cif;
    private String localicade;
    private Empregado[] arrayEmpregado;

    public Empresa(String nome) {
        this.nome = nome;
        this.cif = "A123125434";
        this.localicade = "Santiago de Compostela";
        this.arrayEmpregado = new Empregado[6];
    }

    public Empresa(String nome, int numEmpregados) {
        this.nome = nome;
        this.cif = cif;
        this.localicade = localicade;
        this.arrayEmpregado = new Empregado[numEmpregados];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getLocalicade() {
        return localicade;
    }

    public void setLocalicade(String localicade) {
        this.localicade = localicade;
    }

    public Empregado[] getArrayEmpregado() {
        return arrayEmpregado;
    }

    public void setArrayEmpregado(Empregado[] arrayEmpregado) {
        this.arrayEmpregado = arrayEmpregado;
    }

}