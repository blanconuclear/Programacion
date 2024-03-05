import java.util.Arrays;

/**
 * Socio
 */
public class Socio {

    private String nome;
    private String apelido;
    private int codSocio;
    private String email;
    private int dataNacemento;
    private int[] actividadesInscrito = new int[3];

    public Socio(String nome, String apelido, int codSocio, String email, int dataNacemento,
            int[] actividadesInscrito) {
        this.nome = nome;
        this.apelido = apelido;
        this.codSocio = codSocio;
        this.email = email;
        this.dataNacemento = dataNacemento;
        this.actividadesInscrito = actividadesInscrito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(int codSocio) {
        this.codSocio = codSocio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(int dataNacemento) {
        this.dataNacemento = dataNacemento;
    }

    public int[] getActividadesInscrito() {
        return actividadesInscrito;
    }

    public void setActividadesInscrito(int[] actividadesInscrito) {
        this.actividadesInscrito = actividadesInscrito;
    }

    @Override
    public String toString() {
        return "Socio [nome=" + nome + ", apelido=" + apelido + ", codSocio=" + codSocio + ", email=" + email
                + ", dataNacemento=" + dataNacemento + ", actividadesInscrito=" + Arrays.toString(actividadesInscrito)
                + "]";
    }

}