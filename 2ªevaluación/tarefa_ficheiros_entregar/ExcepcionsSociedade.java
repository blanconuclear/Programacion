public class ExcepcionsSociedade extends Exception {

    private String mensaxe;
    private int codError;

    public ExcepcionsSociedade(String mensaxe, int codError) {
        this.mensaxe = mensaxe;
        this.codError = codError;
    }

    @Override
    public String getMessage() {
        return "Código de erro " + codError + ", " + mensaxe;
    }
}
