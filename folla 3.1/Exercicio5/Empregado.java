package exercicio5;

public class Empregado {

    public String nome;
    public String apelido;
    public String dni;
    public int salario;

    public Empregado() {
        nome = "Andrés";
        apelido = "Gonzalez";
        dni = "99485734Y";
        salario = 1230;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getDni() {
        return dni;
    }

    public int getSalario() {
        return salario;
    }
}
