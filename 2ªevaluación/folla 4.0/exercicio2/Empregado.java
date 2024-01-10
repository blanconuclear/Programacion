package exercicio2;

public class Empregado {

    private String nome;
    private int numeroIdentificacion;
    private String categoria;
    private int soldo;

    public Empregado() {
        this.nome = "Carlos";
        this.numeroIdentificacion = 234;
        this.categoria = "programador";
        this.soldo = 1235;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getSoldo() {
        return soldo;
    }

    public void setSoldo(int soldo) {
        if (this.categoria.equals("programador")) {
            if (soldo >= 1100 && soldo <= 1800) {
                this.soldo = soldo;
            } else {
                System.out.println("O soldo está fora dos límites.");
            }
        }

        if (this.categoria.equals("analista")) {
            if (soldo >= 1500 && soldo <= 2200) {
                this.soldo = soldo;
            } else {
                System.out.println("O soldo está fora dos límites.");
            }
        }

        if (this.categoria.equals("consultor")) {
            if (soldo >= 1700 && soldo <= 3500) {
                this.soldo = soldo;
            } else {
                System.out.println("O soldo está fora dos límites.");
            }
        }

        if (this.categoria.equals("directivo")) {
            if (soldo >= 4000 && soldo <= 4800) {
                this.soldo = soldo;
            } else {
                System.out.println("O soldo está fora dos límites.");
            }
        }
    }

}