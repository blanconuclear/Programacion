import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.sql.Date;
import java.time.LocalDate;

public class Socio {
    private int codSocio;
    private String nome;
    private String apelido;
    private String email;
    private Date dataNacemento;
    private int[] actividadesInscrito = new int[3];

    public Socio(int codSocio, String nome, String apelido, String email, Date dataNacemento)
            throws ExcepcionsSociedade {
        this.codSocio = codSocio;
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.dataNacemento = dataNacemento;

        validarDatos();
    }

    private void validarDatos() throws ExcepcionsSociedade {
        if (!comprobarEmail(email)) {
            throw new ExcepcionsSociedade("O email introducido non é válido", 4);
        }
        if (!comprobarDataNacemento(dataNacemento)) {
            throw new ExcepcionsSociedade("A data de nacemento non é válida", 5);
        }
    }

    private boolean comprobarEmail(String email) {
        Pattern patron = Pattern.compile(
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher match = patron.matcher(email);
        return match.find();
    }

    private boolean comprobarDataNacemento(Date dataNacemento) {
        LocalDate fecha = dataNacemento.toLocalDate();
        return fecha.isBefore(LocalDate.now());
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