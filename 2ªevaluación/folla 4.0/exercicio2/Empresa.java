package exercicio2;

public class Empresa {

    private String nome;
    private String cif;
    private String localicade;
    private Empregado[] arrayEmpregado;
    public static int numEmpregados;

    public Empresa(String nome) {
        this.nome = nome;
        this.cif = "A123125434";
        this.localicade = "Santiago de Compostela";
        this.arrayEmpregado = new Empregado[6];
        numEmpregados++;
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

    // C
    public int getNumEmpregados() {
        int numEmpregados = 0;
        for (int i = 0; i < 6; i++) {
            if (arrayEmpregado[i] != null) {
                numEmpregados++;
            }
        }
        return numEmpregados;
    }

    public boolean comprobarEmpregado(int numIdentificacion) {
        for (int i = 0; i < getNumEmpregados() - 1; i++) {
            if (arrayEmpregado[i].getNumeroIdentificacion() == numIdentificacion) {
                return true;
            }
        }
        return false;
    }

    public String getNomeEmpregado(int numIdentificacion) {
        for (int i = 0; i < getNumEmpregados() - 1; i++) {
            return arrayEmpregado[i].getNome();
        }
        return " ";
    }

    public void getNomesEmpregados() {
        for (int i = 0; i < getNumEmpregados() - 1; i++) {
            System.out.println(arrayEmpregado[i].getNome());
        }
    }

    public int obterNumeroIdentificacion(int nu)



}