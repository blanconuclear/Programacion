/*Crea unha clase chamada Empregado, que conteña atributos públicos para o nome, os apelidos, o DNI e o salario. 
Engade un construtor sen argumentos, que poña uns valores "razoables" neses atributos. 
Crea varios métodos setNome(String nome ), setApelidos(String apelido), setDni(... ), e setSalario(... ), que modifiquen os valores cos argumentos. 
Crea 2 empregados e comproba que os métodos fan o que deben facer. */

package Exercicio5;

public class Empregado {

    // Atributos
    public String nome;
    public String apelido;
    public String DNI;
    public int salario;

    public Empregado() {
        nome = "Paco";
        apelido = "Corzo";
        DNI = "33567578G";
        salario = 2000;
    }

    public Empregado(String nome, String apelido, String DNI, int salario) {
        this.nome = nome;
        this.apelido = apelido;
        this.DNI = DNI;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public String getDNI() {
        return DNI;
    }

    public int getSalario() {
        return salario;
    }
}
