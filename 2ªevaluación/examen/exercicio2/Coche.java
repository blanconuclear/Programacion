package exercicio2;

public class Coche {

    private String matricula;
    private int prezo;
    private String modelo;

    public Coche(String matricula, int prezo, String modelo) {
        this.matricula = matricula;
        this.prezo = prezo;
        this.modelo = modelo;
    }

    // validar prezo
    public void validarPrezo() throws CocheException {
        if (prezo <= 10000 & prezo >= 100000) {
            throw new CocheException(matricula, prezo);
        }
    }

    // validar modelo
    public void validarModelo() throws CocheException {
        if (modelo.toLowerCase() != "tesla" || modelo.toLowerCase() != "toyota") {
            throw new CocheException(matricula, prezo);
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Coche [matricula=" + matricula + ", prezo=" + prezo + ", modelo=" + modelo + "]";
    }

}