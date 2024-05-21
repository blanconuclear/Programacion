package exercicioRepaso2;

import java.io.Serializable;

public class Tema implements Serializable {
    private String nome;
    private String autor;
    private int ano;
    private String xenero;

    public Tema(String nome, String autor, int ano, String xenero) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.xenero = xenero;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getXenero() {
        return xenero;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Autor: " + autor + ", Ano: " + ano + ", Xénero: " + xenero;
    }
}
