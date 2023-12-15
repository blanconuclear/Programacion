package Exercicio2;

/*Comproba que se cambias o tipo da variable tempo a private o método AppNave non pode acceder a ese atributo (é
privado). */

public class Nave {

    /* ATRIBUTOS */
    public String nome;
    private int tempo;

    /* MÉTODOS */

    public Nave() {
        nome = "apolo13";
        tempo = 10;
    }

    public void SetTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getTempo() {
        return this.tempo;
    }

}
