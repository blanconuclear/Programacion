package exercicio5;

/**
 * Cliente
 */
public class Cliente {

    private String nome;
    private int telefono;
    private String mail;

    public Cliente(String nome, int telefono, String mail) {
        this.nome = nome;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}