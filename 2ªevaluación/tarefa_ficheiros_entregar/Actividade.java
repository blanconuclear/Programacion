/**
 * Actividade
 */
public class Actividade {
    private int codActividade;
    private String nomeActividade;
    private int horasSemanais;
    private int prezoActividade;
    private String salaActividade;

    public Actividade(int codActividade, String nomeActividade, int horasSemanais, int prezoActividade,
            String salaActividade) throws ExcepcionsSociedade {
        this.codActividade = codActividade;
        this.nomeActividade = nomeActividade;
        this.horasSemanais = horasSemanais;
        this.prezoActividade = prezoActividade;
        this.salaActividade = salaActividade;

        validarDatos();
    }

    private void validarDatos() throws ExcepcionsSociedade {
        if (!comprobarHorasSemanais(horasSemanais)) {
            throw new ExcepcionsSociedade("As horas deben estar entre 2 e 3", 1);
        }
        if (!comprobarPrezo(prezoActividade)) {
            throw new ExcepcionsSociedade("O prezo debe ser inferior a 50", 2);
        }
        if (!comprobarSala(salaActividade)) {
            throw new ExcepcionsSociedade("Nome da sala non válido, debe ser Castelao ou Dali", 3);
        }
    }

    private boolean comprobarHorasSemanais(int horasSemanais) {
        return horasSemanais >= 2 && horasSemanais <= 3;
    }

    private boolean comprobarPrezo(int prezoActividade) {
        return prezoActividade < 50;
    }

    private boolean comprobarSala(String salaActividade) {
        return salaActividade.equals("castelao") || salaActividade.equals("dali");
    }

    public int getCodActividade() {
        return codActividade;
    }

    public void setCodActividade(int codActividade) {
        this.codActividade = codActividade;
    }

    public String getNomeActividade() {
        return nomeActividade;
    }

    public void setNomeActividade(String nomeActividade) {
        this.nomeActividade = nomeActividade;
    }

    public int getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public int getPrezoActividade() {
        return prezoActividade;
    }

    public void setPrezoActividade(int prezoActividade) {
        this.prezoActividade = prezoActividade;
    }

    public String getSalaActividade() {
        return salaActividade;
    }

    public void setSalaActividade(String salaActividade) {
        this.salaActividade = salaActividade;
    }

    @Override
    public String toString() {
        return "Actividade [codActividade=" + codActividade + ", nomeActividade=" + nomeActividade
                + ", horasSemanais=" + horasSemanais + ", prezoActividade=" + prezoActividade + ", salaActividade="
                + salaActividade + "]";
    }

    public String toStringToFile() {
        return codActividade + ";" + nomeActividade + ";" + horasSemanais + ";" + prezoActividade + ";"
                + salaActividade;
    }

}
