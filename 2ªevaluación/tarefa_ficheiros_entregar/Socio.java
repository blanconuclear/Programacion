import java.sql.Date;
import java.util.Arrays;

/**
 * Socio
 */
public class Socio {

    private int codSocio;
    private String nome;
    private String apelido;
    private String email;
    private Date dataNacemento;
    private int[] actividadesInscrito = new int[3];

    public Socio(int codSocio, String nome, String apelido, String email, Date dataNacemento) {
        this.codSocio = codSocio;
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.dataNacemento = dataNacemento;
    }

    public int getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(int codSocio) {
        this.codSocio = codSocio;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNacemento() {
        return dataNacemento;
    }

    public void setDataNacemento(Date dataNacemento) {
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
        return "Socio [codSocio=" + codSocio + ", nome=" + nome + ", apelido=" + apelido + ", email=" + email
                + ", dataNacemento=" + dataNacemento + ", actividadesInscrito=" + Arrays.toString(actividadesInscrito)
                + "]";
    }

    public String toStringParaFichero() {
        return nome + ";" + apelido + ";" + email + ";" + dataNacemento;
    }
}