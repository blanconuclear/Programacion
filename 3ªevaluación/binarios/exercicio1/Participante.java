package exercicio1;

import java.io.Serializable;

/* Crea unha clase Participante con nome, apelidos, e idade, que sexa serializable. Fai un programa que pida 3
participantes, e os grave un a un nun ficheiro binario participantes.dat, empregando serialización.
 */
public class Participante implements Serializable {
    private String nome;
    private String apelido;
    private int idade;

    public Participante(String nome, String apelido, int idade) {
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Participante [nome=" + nome + ", apelido=" + apelido + ", idade=" + idade + "]";
    }

}
