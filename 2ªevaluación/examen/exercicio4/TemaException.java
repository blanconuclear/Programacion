package exercicio4;

public class TemaException extends Exception {

    private String nomeEx;
    private int codEx;

    public TemaException(String nomeEx, int codEx) {
        this.nomeEx = nomeEx;
        this.codEx = codEx;
    }

    @Override
    public String toString() {
        return "TemaException [nomeEx=" + nomeEx + ", codEx=" + codEx + "]";
    }

    
}