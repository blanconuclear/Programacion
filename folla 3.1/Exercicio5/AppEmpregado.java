package exercicio5;

public class AppEmpregado {
    public static void main(String[] args) {

        Empregado empregado1 = new Empregado();
        Empregado empregado2 = new Empregado();

        empregado2.setNome("toño");
        empregado2.setApelido("rodriguez");
        empregado2.setDni("33443234T");
        empregado2.setSalario(2000);

        System.out.println(empregado2.getNome());
        System.out.println(empregado2.getApelido());
        System.out.println(empregado2.getDni());
        System.out.println(empregado2.getSalario());

        System.out.println("_____________________");

        System.out.println(empregado1.nome);
        System.out.println(empregado1.apelido);
        System.out.println(empregado1.dni);
        System.out.println(empregado1.salario);
    }
}
