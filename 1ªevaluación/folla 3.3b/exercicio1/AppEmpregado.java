package exercicio1;

public class AppEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Jose", 10);
        Empregado empregado2 = new Empregado("Andrés", 1);

        System.out.println("O empregado1 chámase: " + empregado1.getNome() + " . E leva na empresa: "
                + empregado1.getAntigüidade() + " anos. Está cobrando actualmente: " + empregado1.calcularSalario());
        System.out.println("O empregado2 chámase: " + empregado2.getNome() + " . E leva na empresa: "
                + empregado2.getAntigüidade() + " anos. Está cobrando actualmente: " + empregado2.calcularSalario());

    }
}
