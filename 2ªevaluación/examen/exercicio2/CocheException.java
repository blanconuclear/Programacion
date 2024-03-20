package exercicio2;

public class CocheException extends Exception {

    private String nomeEx;
    private int codEx;

    public CocheException(String nomeEx, int codEx) {
        this.nomeEx = nomeEx;
        this.codEx = codEx;
    }

    @Override
    public String toString() {
        return "CocheException [nomeEx=" + nomeEx + ", codEx=" + codEx + "]";
    }

}