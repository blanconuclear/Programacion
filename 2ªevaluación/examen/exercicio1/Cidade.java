package exercicio1;

public abstract class Cidade {
    private String cidade;
    private int poboacion;

    public Cidade(String cidade, int poboacion) {
        this.cidade = cidade;
        this.poboacion = poboacion;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getPoboacion() {
        return poboacion;
    }

    public void setPoboacion(int poboacion) {
        this.poboacion = poboacion;
    }

}