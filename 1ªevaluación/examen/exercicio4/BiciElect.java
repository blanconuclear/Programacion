package exercicio4;

/**
 * BiciElect
 */
public class BiciElect {

    private String nome;
    private String marca;
    private int autonomiaKms;
    private static int numBicis=0;


    public BiciElect(String nome, String marca, int autonomiaKms) {
        this.nome = nome;
        this.marca = marca;
        this.autonomiaKms = autonomiaKms;
        numBicis++;
    }

    public BiciElect() {
        this.nome = "nome";
        this.marca = "marca";
        this.autonomiaKms = 23;
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


    public int getAutonomiaKms() {
        return autonomiaKms;
    }


    public void setAutonomiaKms(int autonomiaKms) {
        this.autonomiaKms = autonomiaKms;
    }


/*     public static comparaAutonomia(){
        
    } */

    

    
}