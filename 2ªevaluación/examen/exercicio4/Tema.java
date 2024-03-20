package exercicio4;

public class Tema {

    private String titulo;
    private String grupo;
    private String disco;
    private int ano;
    private int duracion;

    public Tema(String titulo, String grupo, String disco, int ano, int duracion) {
        this.titulo = titulo;
        this.grupo = grupo;
        this.disco = disco;
        this.ano = ano;
        this.duracion = duracion;
    }

    public void validarAno() throws TemaException {
        if (ano < 1900) {

            throw new TemaException(disco, ano);
        }
    }

    public void validarDuracion() throws TemaException {
        if (duracion < 1900) {

            throw new TemaException(disco, ano);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return titulo + ":" + grupo + ":" + disco + ":" + ano + ":"
                + duracion;
    }

}