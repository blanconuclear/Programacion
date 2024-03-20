package exercicio1;

public class Cliente extends Cidade {

    private String nomeCliente;

    public Cliente(String cidade, int poboacion, String nomeCliente) {
        super(cidade, poboacion);
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

}