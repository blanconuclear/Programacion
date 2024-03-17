package miñaPorbaexception;

public class ExceptionPersonalizada extends Exception {
    private String nomeErro;
    private int codError;

    public ExceptionPersonalizada(String nomeErro, int codError) {
        this.nomeErro = nomeErro;
        this.codError = codError;
    }

    @Override
    public String toString() {
        return "ExceptionPersonalizada [nomeErro=" + nomeErro + ", codError=" + codError + "]";
    }

}
