import java.util.Arrays;

/**
 * Socio
 */
public class Socio {

    private int codSocio;
    private String nome;
    private String apelido;
    private String email;
    private String dataNacemento;
    private int[] actividadesInscrito = new int[3];

    public Socio(int codSocio, String nome, String apelido, String email, String dataNacemento,
            int[] actividadesInscrito) {

        this.codSocio = codSocio;
        this.nome = nome;
        this.apelido = apelido;
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

    public String getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(String dataNacemento) {
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