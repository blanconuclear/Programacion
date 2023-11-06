package Exercicio5;

public class AppEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Jose", "Gonzalez", "56844567G", 1230);
        Empregado empregado2 = new Empregado();

        System.out
                .println(empregado1.nome + " " + empregado1.apelido + " con DNI: " + empregado1.DNI
                        + " .Ten un salario de: "
                        + empregado1.salario);
        System.out
                .println(empregado2.nome + " " + empregado2.apelido + " con DNI: " + empregado2.DNI
                        + " .Ten un salario de: "
                        + empregado2.salario);

        empregado1.setNome("Lolo");
        empregado1.setApelido("Dominguez");
        empregado1.setDNI("33243677J");
        empregado1.setSalario(1450);

        System.out
                .println(empregado1.getNome() + " " + empregado1.getApelido() + " con DNI: " + empregado1.getDNI()
                        + " .Ten un salario de: "
                        + empregado1.getSalario());

    }
}
