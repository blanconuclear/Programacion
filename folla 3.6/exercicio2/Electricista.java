package exercicio2;

public class Electricista extends Traballador {

    private boolean fixoTemporal;

    public Electricista(String dni, String nome, String apelido, boolean fixoTemporal) {
        super(dni, nome, apelido);
        this.fixoTemporal = fixoTemporal;
    }

    public boolean isFixoTemporal() {
        return fixoTemporal;
    }

    public void setFixoTemporal(boolean fixoTemporal) {
        this.fixoTemporal = fixoTemporal;
    }

    public String tipoContrato() {

        if (fixoTemporal == false) {
            return "Temporal";
        } else {
            return "Fixo";
        }
    }

}
