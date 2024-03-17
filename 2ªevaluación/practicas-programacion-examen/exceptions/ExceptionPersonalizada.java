package exceptions;

public class ExceptionPersonalizada extends Exception {

    private String mensaxe;
    private int codError;

    public ExceptionPersonalizada(String mensaxe, int codError) {
        this.mensaxe = mensaxe;
        this.codError = codError;

    }

    @Override
    public String toString() {
        return "ExceptionPersonalizada [mensaxe=" + mensaxe + ", codError=" + codError + "]";
    }

}
