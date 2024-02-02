package exercicio2;

class Barco {
    private String nome;
    private int numeroTripulantes;
    private int capacidadeCarga;

    public Barco(String nome, int numeroTripulantes, int capacidadeCarga) {
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String toString() {
        return "Nome: " + nome + "\nNúmero de Tripulantes: " + numeroTripulantes +
                "\nCapacidade de Carga: " + capacidadeCarga;
    }
}
