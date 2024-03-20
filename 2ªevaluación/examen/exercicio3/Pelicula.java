package exercicio3;

public class Pelicula {

    private String titulo;
    private String duracion;
    private String ano;
    private String director;
    private String actorPrincipal;
    private String actrizprincipal;

    public Pelicula(String titulo, String duracion, String ano, String director, String actorPrincipal,
            String actrizprincipal) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.ano = ano;
        this.director = director;
        this.actorPrincipal = actorPrincipal;
        this.actrizprincipal = actrizprincipal;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActrizprincipal() {
        return actrizprincipal;
    }

    public void setActrizprincipal(String actrizprincipal) {
        this.actrizprincipal = actrizprincipal;
    }

    @Override
    public String toString() {
        return titulo + ":" + duracion + ":" + ano + ":" + director + ":" + actorPrincipal + ":" + actrizprincipal;
    }

}
