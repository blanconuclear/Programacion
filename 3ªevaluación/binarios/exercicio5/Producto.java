package exercicio5;

import java.io.Serializable;

public class Producto implements Serializable {
    private static final long serialVersionUID = 1L; // Identificador único de versión para la serialización
    private String nome;
    private String marca;
    private String tipo;
    private double prezo;

    public Producto(String nome, String marca, String tipo, double prezo) {
        this.nome = nome;
        this.marca = marca;
        this.tipo = tipo;
        this.prezo = prezo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", marca=" + marca + ", tipo=" + tipo + ", prezo=" + prezo;
    }

}
